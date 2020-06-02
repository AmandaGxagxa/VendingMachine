package ExtendableVendingMachine;

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
//        System.out.printf(evm.buy(new SoftDrink()));


    }


}
