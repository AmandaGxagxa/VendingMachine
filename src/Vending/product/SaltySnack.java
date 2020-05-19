package Vending.product;

public class SaltySnack {
   int stockCount = 10;
    public void buy(SaltySnack saltySnack){
        System.out.println("Bought SaltySnack");
     stockCount--;
    }
}
