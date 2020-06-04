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
            }else{
                softDrinkQty=0;
                System.out.println("We do not have stock for Soft Drinks");}
        }

        if(product instanceof SaltySnack){
            if(saltySnackQty >= 0){
                saltySnackQty --;
            }else {
                saltySnackQty = 0;
                System.out.println("We do not have stock for Soft Drinks");}
        }

        if(product instanceof Chocolate){
            if(chocolateQty >= 0){
                chocolateQty --;
            }else {
                chocolateQty = 0;
                System.out.println("We do not have stock for Soft Drinks");}
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
            System.out.println("Adding "+ this.softDrinkQty + " softdrinks");
        }
        else if(product instanceof SaltySnack ){
            saltySnackQty +=3;
            System.out.println("Adding "+ this.saltySnackQty + " salty snacks");
        } else if(product instanceof Chocolate){
            chocolateQty +=3;
            System.out.println("Adding "+ this.chocolateQty + " chocolates");
        }else{
            System.out.println("Adding nothing to the stock");
        }

    }
    public int getStock(Product product){
        if(product instanceof SoftDrink){
            return softDrinkQty;
        }else if(product instanceof SaltySnack){
            return saltySnackQty;
        } else if(product instanceof Chocolate){
            return chocolateQty;
        } else if(product instanceof Product) {
           return softDrinkQty+ saltySnackQty + chocolateQty;
        }
        return 0;
    }
    public void buy(Product product, int qty){
        if(product instanceof SoftDrink){
            softDrinkQty =softDrinkQty - qty;
        }
        if(product instanceof SaltySnack){
            saltySnackQty =saltySnackQty - qty;
        }
        if(product instanceof Chocolate){
            chocolateQty =chocolateQty - qty;
        }
    }
    public void addStock(Product product, int qty){
        if(product instanceof SoftDrink){
            softDrinkQty =softDrinkQty + qty;
            System.out.println(qty + "soft drinks added");
        }
        if(product instanceof SaltySnack){
            saltySnackQty =saltySnackQty + qty;
            System.out.println(qty + "Salty Snacks added");
        }
        if(product instanceof Chocolate){
            chocolateQty =chocolateQty + qty;
            System.out.println(qty + "Chocolates added");
        }
    }

    public static void main(String [] args){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(12,20,5);
        evm.buy(new SoftDrink());
        evm.buy(new SaltySnack());
        evm.getStock(new SaltySnack());
        evm.addStock(new Chocolate());
        evm.addStock(new Product());
        evm.addStock(new Product(), 5);
     //System.out.printf(buy(new SoftDrink()));


    }


}
