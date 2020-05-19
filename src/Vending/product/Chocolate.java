package Vending.product;

public class Chocolate {
    int stockCount = 10;
    public  void buy(Chocolate chocolate){
        System.out.println("Bought SaltySnack");
        stockCount--;
    }
}
