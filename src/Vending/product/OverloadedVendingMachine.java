package Vending.product;

public class OverloadedVendingMachine {
    static int product ;
    static int softDrink ;
    static int saltySnack;
    static int chocolate ;

     //add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrink= softDrinkQty;
        this.saltySnack = saltySnacksQty;
        this.chocolate = chocolatesQty;
    }
    public void buy(SoftDrink softDrink) {

        System.out.println("Bought soft drink");
    }


    public void buy(SaltySnack saltySnack){
        System.out.println("Bought SaltySnack");
    }
    public  void buy(Chocolate chocolate){
        System.out.println("Bought SaltySnack");
    }
    void buy() {
        System.out.println("This is a product");
    }

    public static void main(String [] args){
        //OverloadedVendingMachine ovm = new OverloadedVendingMachine();

        SoftDrink softDrink =  new SoftDrink();
        SaltySnack saltySnack =  new SaltySnack();
        softDrink.buy(new SoftDrink());
        softDrink.buy(new SoftDrink());
        saltySnack.buy(new SaltySnack());
        saltySnack.buy(new SaltySnack());
    }

}
