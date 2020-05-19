package Vending.product;
public class OverloadedVendingMachine {
     int ChocolateQty =10;
    int softDrinkQty = 10;
     //add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        softDrinkQty = 10;
        saltySnacksQty = 15;
        chocolatesQty = 11;
    }
    public int softDrink(SoftDrink softDrink){
        return softDrinkQty--;
    }
    public int boughtCount(SaltySnack saltySnack){
        return ChocolateQty--;
    }

    public  void boughtCount(Product product){

    }

    public static void main(String [] args){
     //OverloadedVendingMachine ovm = new OverloadedVendingMachine();
        SoftDrink softDrink =  new SoftDrink();
        softDrink.buy(new SoftDrink());
        softDrink.buy(new SoftDrink());
        softDrink.buy(new SoftDrink());
    }

}
