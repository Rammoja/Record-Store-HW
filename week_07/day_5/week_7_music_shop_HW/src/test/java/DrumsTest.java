import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {


        Drums drums;

        @Before
        public void before(){
            this.drums = new Drums("Millenium", "JDK 5 Piece", 34.00, 45.00);

        }

        @Test
        public void canGetMake(){
            assertEquals("Millenium",drums.getMake());
        }

        @Test
        public void canGetModel(){
            assertEquals("JDK 5 Piece",drums.getModel());
        }

        @Test
        public void canBuy(){
            assertEquals(34.00,drums.getBuyingPrice(), 0.01);
        }

        @Test
        public void canSell(){
            assertEquals(45.00,drums.getSellingPrice(), 0.01);
        }
}