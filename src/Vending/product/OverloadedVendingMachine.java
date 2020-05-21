package Vending.product;

public class OverloadedVendingMachine {
    private  int chocolatesQty;
    private  int softDrinkQty ;
    private  int saltySnacksQty;
   // private  int productCount= chocolatesQty + softDrinkQty + saltySnacksQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty= softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    public void buy(SoftDrink softDrink) {
        if(softDrinkQty>=1){
            System.out.println("Bought soft drink " + this.softDrinkQty);
            softDrinkQty--;
        }
        else
        {
            System.out.println("We are running out of soft drinks");
        }

    }
    public void buy(SaltySnack saltySnack) {
        if(saltySnacksQty>=1){
            System.out.println("Bought soft drink " + this.saltySnacksQty);
            saltySnacksQty--;
        }
        else
        {
            System.out.println("We are running out of Salty Snacks");
        }

    }
    public void buy(Chocolate chocolate) {
        if(chocolatesQty>=1){
            System.out.println("Chocolate  is bought " + this.chocolatesQty);
            chocolatesQty--;
        }
        else
        {
            System.out.println("We are running out of Chocolates");
        }

    }

    public int getSaltySnackCount(SoftDrink softDrink) {
        return   softDrinkQty--;
    }

    public int getSaltySnackCount(SaltySnack saltySnack) {
      return   saltySnacksQty--;
    }
    public int getChocolateCount(Chocolate chocolate){
       return chocolatesQty--;
    }


    //addStock METHOD
    void addStock(SoftDrink softDrink){
        System.out.println("Softdrink added "+ this.softDrinkQty);
        softDrinkQty++;
    }
    void addStock(SaltySnack saltySnack){
        System.out.println("Salty snack added "+ this.saltySnacksQty);
      ++  saltySnacksQty;
    }
    void addStock(Chocolate chocolate){
        System.out.println("Chocolates added "+ this.chocolatesQty);
       ++ chocolatesQty;
    }



    public static void main(String [] args){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(13, 15, 17);

        ovm.buy(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.buy(new Chocolate());

        ovm.buy(new SaltySnack());
        ovm.addStock(new SaltySnack());
        ovm.addStock(new SaltySnack());
        ovm.addStock(new SaltySnack());

        //ovm.getStock(new Product());
    }

}
