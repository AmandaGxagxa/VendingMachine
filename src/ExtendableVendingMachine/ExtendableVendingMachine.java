package ExtendableVendingMachine;

import Vending.product.Chocolate;
import Vending.product.Product;
import Vending.product.SaltySnack;
import Vending.product.SoftDrink;

public class ExtendableVendingMachine {
    private int softDrinkQty=0;
    private int saltySnackQty = 0;
    private int chocolateQty = 0;

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
        if (product instanceof Product){
            if(softDrinkQty >=0 && saltySnackQty >=0 && chocolateQty >= 0) {
                chocolateQty--;
                saltySnackQty--;
                softDrinkQty--;
            }
        }

    }

    ExtendableVendingMachine(int softDrinkQty, int saltySnackQty, int chocolateQty){
            this.softDrinkQty = softDrinkQty;
            this.saltySnackQty = saltySnackQty;
            this.chocolateQty = chocolateQty;
    }

    public void addStock(Product product){
        if(product instanceof SoftDrink) {
         softDrinkQty = softDrinkQty +3;
        }
        else if(product instanceof SaltySnack ){
            saltySnackQty +=3;
        } else if(product instanceof Chocolate){
            chocolateQty +=3;
        }

    }
    public int getStock(Product product){
        if(product instanceof SoftDrink){
            return softDrinkQty;
        }else if(product instanceof SaltySnack){
            return saltySnackQty;
        } else if(product instanceof Chocolate){
            return chocolateQty;
        } else {
            return 0;
        }
//        return 0;
    }

    public static void main(String [] args){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(12,20,5);
        evm.buy(new SoftDrink());
        evm.buy(new SaltySnack());
     //System.out.printf(buy(new SoftDrink()));


    }


}
