import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DrumSticksTest {


    DrumSticks drumSticks;

    @Before
    public void before(){
        this.drumSticks = new DrumSticks ("Pro-Mark", 7.00, 10.00);

    }

    @Test
    public void canGetMake(){
        assertEquals("Pro-Mark",drumSticks.getMake());
    }


    @Test
    public void canBuy(){
        assertEquals(7.00,drumSticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void canSell(){
        assertEquals(10.00,drumSticks.getSellingPrice(), 0.01);
    }
}

