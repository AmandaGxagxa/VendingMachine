package Vending.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOvm {
    @Test
    public void shouldBuySoftDrink(){
    OverloadedVendingMachine ovm = new OverloadedVendingMachine(13, 15, 17);
       assertEquals("Bought soft drink ",ovm.buy(new SoftDrink()));
    }
}
