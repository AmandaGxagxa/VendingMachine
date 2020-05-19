package Vending.product;
public class OverloadedVendingMachine {

     //add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        softDrinkQty = 10;
        saltySnacksQty = 15;
        chocolatesQty = 11;
    }




        public  void buy(Product product){

        }
//        SoftDrink softDrink =  new SoftDrink();
//        SaltySnack saltySnack =  new SaltySnack();
//        Chocolate chocolate =  new Chocolate();

    public static void main(String [] args){
     //OverloadedVendingMachine ovm = new OverloadedVendingMachine();
        SoftDrink softDrink =  new SoftDrink();
        softDrink.buy(new SoftDrink());

    }

}
