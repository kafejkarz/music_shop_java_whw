import customers.Customer;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", 130, 170, "black");
        customer = new Customer("Arek", 200);

    }
    @Test
    public void customerHaveMoney(){
        assertEquals(200, customer.getWallet(), 0.01);
    }

    @Test
    public void canHaveInstrumentCount(){
        assertEquals(0, this.customer.getInstrumentsCount());
    }

}
