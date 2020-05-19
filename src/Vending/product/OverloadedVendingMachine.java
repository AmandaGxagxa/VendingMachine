package Vending.product;

public class OverloadedVendingMachine {
    Product product = new Product();
    SoftDrink softDrink = new SoftDrink();
    SaltySnack saltySnack = new SaltySnack();
    Chocolate chocolate = new Chocolate();

     //add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrink.stockCount = softDrinkQty;
        this.saltySnack.stockCount = saltySnacksQty;
        this.chocolate.stockCount = chocolatesQty;
    }


    public static void main(String [] args){
     //OverloadedVendingMachine ovm = new OverloadedVendingMachine();
        SoftDrink softDrink =  new SoftDrink();
        SaltySnack saltySnack =  new SaltySnack();
       // OverloadedVendingMachine ovm = new OverloadedVendingMachine(softDrink,saltySnack,);
        softDrink.buy(new SoftDrink());
        softDrink.buy(new SoftDrink());
        saltySnack.buy(new SaltySnack());
        saltySnack.buy(new SaltySnack());
    }

}
