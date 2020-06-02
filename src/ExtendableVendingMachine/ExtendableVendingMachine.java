package ExtendableVendingMachine;

import Vending.product.Chocolate;
import Vending.product.Product;
import Vending.product.SaltySnack;
import Vending.product.SoftDrink;

public class ExtendableVendingMachine {
    int softDrinkQty=0;
    int saltySnackQty = 0;
    int chocolateQty = 0;
    public void buy(Product product){
        if (product instanceof SoftDrink){
            if(softDrinkQty >= 0){
                softDrinkQty--;
            }else{System.out.println("We do not have stock for Soft Drinks");}
        }

        if(product instanceof SaltySnack){
            if(saltySnackQty >= 0){
                saltySnackQty --;
            }else {System.out.println("We do not have stock for Soft Drinks");}
        }

        if(product instanceof Chocolate){
            if(chocolateQty >= 0){
                chocolateQty --;
            }else {System.out.println("We do not have stock for Soft Drinks");}
        }

    }

    public static void main(String [] args){
        ExtendableVendingMachine evm = new ExtendableVendingMachine();
        evm.buy(new SoftDrink());
        evm.buy(new SaltySnack());
     //System.out.printf(buy(new SoftDrink()));


    }


}
