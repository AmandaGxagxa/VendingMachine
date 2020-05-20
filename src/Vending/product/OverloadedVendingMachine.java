package Vending.product;

public class OverloadedVendingMachine {
    static int product ;
    static int softDrink ;
    static int saltySnack;
    static int chocolate ;
    int stockCount;
     //add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrink= softDrinkQty;
        this.saltySnack = saltySnacksQty;
        this.chocolate = chocolatesQty;
    }

    public void buy(SoftDrink softDrink) {

        stockCount++;
        System.out.println("Bought soft drink " + this.stockCount);
    }

    public int buy(SaltySnack saltySnack)
    {
        stockCount++;
        System.out.println("Bought SaltySnack "+ this.stockCount);
        return this.stockCount;
    }
    public int buy(Chocolate chocolate){
        stockCount++;
        System.out.println("Bought Chocolate "+ this.stockCount);
        return this.stockCount;
    }
    int buy(Product product) {
        stockCount++;
        System.out.println("This is a product " + this.stockCount);
        return this.stockCount;
    }

    public static void main(String [] args){
        OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(softDrink, saltySnack, chocolate);

        vendingMachine.buy(new Product());
        vendingMachine.buy(new SoftDrink());
        vendingMachine.buy(new SoftDrink());
        vendingMachine.buy(new Chocolate());
        vendingMachine.buy(new SaltySnack());
    }

}
