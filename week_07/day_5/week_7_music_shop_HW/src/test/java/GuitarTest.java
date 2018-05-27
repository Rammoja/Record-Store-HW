import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        this.guitar = new Guitar("Fender", "Electric", 20.00, 32.00, 15);

    }

    @Test
    public void canGetMake(){
        assertEquals("Fender",guitar.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Electric",guitar.getModel());
    }

    @Test
    public void canBuy(){
        assertEquals(20.00,guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canSell(){
        assertEquals(32.00,guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void getPlayGuitar(){
        assertEquals("Guitar Playing Twang Twang", guitar.play("Twang Twang"));
    }

    @Test
    public void canGetQuantity(){
        assertEquals(15, guitar.getQuantity());
    }
}
