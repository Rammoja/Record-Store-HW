import Accessory.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

        Strings strings;

        @Before
        public void before(){
            this.strings = new Strings ("Elixir", 10.00, 15.00);

        }

        @Test
        public void canGetMake(){
            assertEquals("Elixir",strings.getMake());
        }


        @Test
        public void canBuy(){
            assertEquals(10.00,strings.getBuyingPrice(), 0.01);
        }

        @Test
        public void canSell(){
            assertEquals(15.00,strings.getSellingPrice(), 0.01);
        }
}
