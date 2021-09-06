import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Nice tune", 2000);

    }

    @Test
    public void ShopHaveAName(){
        assertEquals("Nice tune", this.shop.getName());
    }

//    @Test
//    public void canHaveIncome(){
//        assertEquals();
//    }

}
