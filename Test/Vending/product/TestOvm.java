package Vending.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOvm {
    @Test
    public void shouldReturnTwelveSoftDrinks(){
    OverloadedVendingMachine ovm = new OverloadedVendingMachine(13, 15, 17);
    SoftDrink softDrink =new SoftDrink();
        ovm.buy(new SoftDrink());
        ovm.buy(new SoftDrink());
        //new SoftDrink();
       assertEquals(11,ovm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldReturnZeroForStock(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(0, 15, 17);
        SoftDrink softDrink =new SoftDrink();
        ovm.buy(new SoftDrink());
        assertEquals(0,ovm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldReturn(){
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(5, 15, 17);
        SaltySnack saltySnack =new SaltySnack();
        ovm.buy(new SaltySnack());
        assertEquals(0,ovm.getStock(new SaltySnack()));
    }
}
