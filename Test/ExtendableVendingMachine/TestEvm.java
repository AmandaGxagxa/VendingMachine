package ExtendableVendingMachine;

import Vending.product.Chocolate;
import Vending.product.Product;
import Vending.product.SaltySnack;
import Vending.product.SoftDrink;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEvm {
    @Test
    public void itShouldReturnRemaingSoftDrinks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(5,6,10);
        assertEquals(5,evm.getStock(new SoftDrink()));
    }
    @Test
    public void itShouldZeroSoftDrinks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.buy(new SoftDrink() );

        assertEquals(0,evm.getStock(new SoftDrink()));
    }
    @Test
    public void itShouldReturnRemainingChocolates(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.buy(new Chocolate() );

        assertEquals(8,evm.getStock(new Chocolate()));
    } @Test
    public void itShouldReturnRemainingSaltySnacks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.buy(new SaltySnack() );

        assertEquals(4,evm.getStock(new SaltySnack()));
    }
    @Test
    public void itShouldReturnTotalNumberOfSoftDrinks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.addStock(new SoftDrink() );

        assertEquals(5,evm.getStock(new SoftDrink()));
    }
    @Test
    public void itShouldReturnTotalNumberOfSaltySnack(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.addStock(new SaltySnack() );

        assertEquals(9,evm.getStock(new SaltySnack()));
    }
    @Test
    public void itShouldReturnTotalNumberOfChocolate(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.addStock(new Chocolate() );

        assertEquals(13,evm.getStock(new Chocolate()));
    }
    @Test
    public void itShouldReturnTotalNumberOfChocolateAndAddedChocolate(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.addStock(new Chocolate() );

        assertEquals(13,evm.getStock(new Chocolate()));
    }
    @Test
    public void itShouldSubtractOneOfEachProduct(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.buy(new Product() );

        assertEquals(15,evm.getStock(new Product()));
    }
    @Test
    public void itShouldAddNothingOnProductStock(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.addStock(new Product() );

        assertEquals(18,evm.getStock(new Product()));
    }
    @Test
    public void itShouldBoughtStockAndRemainingStock(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.buy(new Product() ,3);
        evm.buy(new Product() ,5);

        assertEquals(18,evm.getStock(new Product()));
    }
    @Test
    public void itShouldAddNothingOnTheStockLevel(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2,6,10);
        evm.addStock(new Product(),2 );

        assertEquals(18,evm.getStock(new Product()));
    }
}
