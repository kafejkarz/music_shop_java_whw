import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import people.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Piano piano;
    Guitar guitar;
    Instrument instrument;


    @Before
    public void before(){
        piano = new Piano("Yamaha", 130, 170, "black");
        guitar = new Guitar("Martin & comp", 300, 100, "light brown");
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

    @Test
    public void canAddInstrument(){
        customer.addInstrument(piano);
        assertEquals(1, this.customer.getInstrumentsCount());
    }

    @Test
    public void canBuyInstrument(){
        customer.buyInstrument(piano);
        assertEquals(30, this.customer.getWallet(),0.01);
    }

    @Test
    public void canBuyMultipleInstruments(){
        customer.buyInstrument(piano);
        customer.buyInstrument(piano);
        assertEquals(-140,this.customer.getWallet(),0.01);
    }





}
