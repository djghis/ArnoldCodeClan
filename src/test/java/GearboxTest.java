import Components.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    private Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox(5);
    }

    @Test
    public void canGetCurrentGear(){
        assertEquals(0, gearbox.getCurrentGear());
    }

    @Test
    public void canGetTopgear(){
        assertEquals(5, gearbox.getTopGear());
    }

    @Test
    public void canIncreaseGear(){
        gearbox.nextGear();
        assertEquals(1, gearbox.getCurrentGear());
    }

    @Test
    public void cantIncreaseGear(){
        gearbox.nextGear();
        gearbox.nextGear();
        gearbox.nextGear();
        gearbox.nextGear();
        gearbox.nextGear();
        gearbox.nextGear();
        assertEquals(5, gearbox.getCurrentGear());
    }

    @Test
    public void cantGoBelow0(){
        gearbox.downGear();
        assertEquals(0, gearbox.getCurrentGear());
    }

    @Test
    public void canDecreaseGear(){
        gearbox.nextGear();
        gearbox.nextGear();
        gearbox.downGear();
        assertEquals(1, gearbox.getCurrentGear());
    }
}
