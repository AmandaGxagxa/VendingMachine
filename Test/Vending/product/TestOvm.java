package Vending.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOvm {
    @Test
    public void shouldReturnElevenSoftDrinks(){
    OverloadedVendingMachine ovm = new OverloadedVendingMachine(13, 15, 17);
    SoftDrink softDrink =new SoftDrink();
        ovm.buy(new SoftDrink());
        ovm.buy(new SoftDrink());
        //new SoftDrink();
       assertEquals(11,ovm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldReturnZeroSoftDrinks(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 15, 17);
        SoftDrink softDrink =new SoftDrink();
        ovm.buy(new SoftDrink());
        ovm.buy(new SoftDrink());
        ovm.buy(new SoftDrink());
        assertEquals(0,ovm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldReturnZeroSaltySnacks(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 2, 17);
        SaltySnack saltySnack =new SaltySnack();
        ovm.buy(new SaltySnack());
        ovm.buy(new SaltySnack());
        ovm.buy(new SaltySnack());
        assertEquals(0,ovm.getStock(new SaltySnack()));
    }
    @Test
    public void shouldReturnFiveSaltySnacks(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 10, 17);
        SaltySnack saltySnack =new SaltySnack();
        ovm.buy(new SaltySnack());
        ovm.buy(new SaltySnack());
        ovm.buy(new SaltySnack());
        ovm.buy(new SaltySnack());
        ovm.buy(new SaltySnack());
        assertEquals(5,ovm.getStock(new SaltySnack()));
    }
    @Test
    public void shouldReturnTwelveChocoltates(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 10, 17);
        Chocolate chocolate =new Chocolate();
        ovm.buy(new Chocolate());
        ovm.buy(new Chocolate());
        ovm.buy(new Chocolate());
        ovm.buy(new Chocolate());
        ovm.buy(new Chocolate());
        assertEquals(12,ovm.getStock(new Chocolate()));
    }
    @Test
    public void shouldRemoveOneFromEachProduct(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 10, 17);
        Product product =new Product();
        ovm.buy(new Product());
        assertEquals(26,ovm.getStock(new Product()));
    }
    @Test
    public void shouldAddTwoSoftDrinks(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 10, 17);
        SoftDrink softDrink =new SoftDrink();
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SoftDrink());
        assertEquals(4,ovm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldAddTwoSaltySnacks(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 10, 17);
        SaltySnack saltySnack =new SaltySnack();
        ovm.addStock(new SaltySnack());
        ovm.addStock(new SaltySnack());
        assertEquals(12,ovm.getStock(new SaltySnack()));
    }
    @Test
    public void shouldHaveTwentyChocolates(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 10, 17);
        Chocolate chocolate =new Chocolate();
        ovm.addStock(new Chocolate());
        ovm.addStock(new Chocolate());
        ovm.addStock(new Chocolate());
        assertEquals(20,ovm.getStock(new Chocolate()));
    }
    @Test
    public void shouldAddThreeOfEachProduct (){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 10, 17);
        Product product =new Product();
        ovm.addStock(new Product());
//        ovm.addStock(new SaltySnack());
//        ovm.addStock(new SoftDrink());
        assertEquals(38,ovm.getStock(new Product()));
    }
}
