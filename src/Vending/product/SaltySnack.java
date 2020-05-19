package Vending.product;

public class SaltySnack {
    int SaltySnackQty = 10;
    public void buy(SaltySnack saltySnack){
        System.out.println("Bought SaltySnack");
        SaltySnackQty--;
    }
}
