import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        this.drums = new Drums("Millenium", "JDK 5 Piece", 34.00, 45.00, 12);

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

    @Test
    public void canChangeBuyingPrice(){
        drums.changeBuyingPrice(36.00);
        assertEquals(36.00,drums.getBuyingPrice(), 0.01);
    }
    @Test
    public void canChangeSellingPrice(){
        drums.changeSellingPrice(47.00);
        assertEquals(47.00,drums.getSellingPrice(), 0.01);

    }

    @Test
    public void getPlayDrums(){
        assertEquals("Drums Playing Badda Boom", drums.play("Badda Boom"));
    }

    @Test
    public void canGetQuantity(){
        assertEquals(12, drums.getQuantity());
    }

    @Test
    public void canSellDrums(){
        assertEquals(1, drums.sell(47.00),0.01);
    }






}
