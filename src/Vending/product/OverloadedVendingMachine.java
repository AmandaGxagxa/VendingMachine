package Vending.product;

public class OverloadedVendingMachine {
    private  int chocolatesQty;
    private  int softDrinkQty ;
    private  int saltySnacksQty;
   // private  int productCount= ;

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
            saltySnacksQty= 0;
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
            chocolatesQty =0;
        }

    }
    public void buy(Product product) {
        if (softDrinkQty >= 1 && saltySnacksQty >= 1 && chocolatesQty >= 1) {
            System.out.println("Three different products bought " + this.chocolatesQty);
            chocolatesQty--;
            softDrinkQty--;
            saltySnacksQty--;
        } else {
            System.out.println("We are running out of stock");
            saltySnacksQty = 0;
        }

    }

    //addStock METHOD
    void addStock(SoftDrink softDrink){
        softDrinkQty++;
        System.out.println("Softdrink added "+ this.softDrinkQty);
    }
    void addStock(SaltySnack saltySnack){
      ++  saltySnacksQty;
        System.out.println("Salty snack added "+ this.saltySnacksQty);
    }
    void addStock(Chocolate chocolate){
       ++ chocolatesQty;
        System.out.println("Chocolates added "+ this.chocolatesQty);
    }
    public void addStock(Product product) {
        System.out.println("Each product is added by 3");


            chocolatesQty+=3;
            softDrinkQty+=3;
            saltySnacksQty+=3;


    }
        //get stock methods
    public int getStock(SoftDrink softDrink) {
        return   softDrinkQty;
    }
    public int getStock(SaltySnack saltySnack) {
        return   saltySnacksQty;
    }
    public int getStock(Chocolate chocolate){

        return chocolatesQty;
    }
    public int getStock(Product product){
        return chocolatesQty +saltySnacksQty + softDrinkQty;
    }

    public static void main(String [] args){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(13, 15, 17);

        ovm.buy(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.buy(new Chocolate());
        ovm.getStock(new SaltySnack());
        ovm.buy(new SaltySnack());
        ovm.addStock(new SaltySnack());
        ovm.addStock(new SaltySnack());
        ovm.addStock(new SaltySnack());

        //ovm.getStock(new Product());
    }

}
