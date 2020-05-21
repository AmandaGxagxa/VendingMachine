package Vending.product;

public class OverloadedVendingMachine {
    private  int chocolateCount;
    private  int softDrinkCount ;
    private  int saltySnackCount;
    private  int productCount= chocolateCount + saltySnackCount + saltySnackCount;
//   int chocolateCount ;
   // int stockCount;
     //add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkCount= softDrinkQty;
        this.saltySnackCount = saltySnacksQty;
        this.chocolateCount = chocolatesQty;
    }

    public void buy(SoftDrink softDrink) {

        softDrinkCount--;
        System.out.println("Bought soft drink " + this.softDrinkCount);
    }

    void buy(SaltySnack saltySnack)
    {
        saltySnackCount--;
        System.out.println("Bought SaltySnack "+ this.saltySnackCount);
        //return this.stockCount;
    }
    void buy(Chocolate chocolate){
        chocolateCount--;
        System.out.println("Bought Chocolate "+ this.chocolateCount);
        //return chocolate.stockCount;
    }
    //counte methods
    public int getSoftDrinkCount(SoftDrink softDrink) {

        return softDrinkCount--;

    }

    public int getSaltySnackCount(SaltySnack saltySnack)
    {
      return   saltySnackCount--;

    }
    public int getChocolateCount(Chocolate chocolate){
       return chocolateCount--;
        //System.out.println("Bought Chocolate "+ this.chocolateCount);

    }
//    public int buy() {
//        //final int products = chocolateCount + saltySnackCount + saltySnackCount;
//
//        System.out.println("This is a product " + this.productCount);
//        return productCount--;
//    }
    public int getStock(Product product) {
       final int products = chocolateCount + saltySnackCount + saltySnackCount;
//        if (product instanceof SoftDrink){
//
//        }
        System.out.println("This is a product " + products);
        return products;
    }

    //addStock METHOD
    void addStock(SoftDrink softDrink){
        System.out.println("Softdrink added "+ this.softDrinkCount);
        softDrinkCount++;
    }
    void addStock(SaltySnack saltySnack){
        System.out.println("Salty snack added "+ this.saltySnackCount);
      ++  saltySnackCount;
    }
    void addStock(Chocolate chocolate){
        System.out.println("Chocolates added "+ this.chocolateCount);
       ++ chocolateCount;
    }
    public int addChocolate(Chocolate chocolate){
      //  System.out.println(chocolateCount);
    return chocolateCount;
    }


    public static void main(String [] args){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(13, 15, 17);

        ovm.buy(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SoftDrink());
        ovm.buy(new Chocolate());
        ovm.addChocolate(new Chocolate());
        ovm.buy(new SaltySnack());
        ovm.addStock(new SaltySnack());
        ovm.addStock(new SaltySnack());
        ovm.addStock(new SaltySnack());

        ovm.getStock(new Product());
    }

}
