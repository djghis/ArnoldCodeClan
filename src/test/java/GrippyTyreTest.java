import Components.GrippyTyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrippyTyreTest {
    private GrippyTyre grippyTyre;
    
    @Before
    public void before() {
        grippyTyre = new GrippyTyre(40);
    }

    @Test
    public void canGetType() {
        assertEquals("Grippy", grippyTyre.getType());
    }

    @Test
    public void canGetWearLevel() {
        assertEquals(40, grippyTyre.getWearLevel());
    }

    @Test
    public void canWearDown() {
        grippyTyre.wearDown();
        assertEquals(30, grippyTyre.getWearLevel());
    }

    @Test
    public void cantWearDownIfDestroyed() {
        grippyTyre.wearDown();
        grippyTyre.wearDown();
        grippyTyre.wearDown();
        grippyTyre.wearDown();
        grippyTyre.wearDown();
        assertEquals(0, grippyTyre.getWearLevel());
    }

    @Test
    public void canCheckTyreStatusGood() {
        assertEquals("All good!", grippyTyre.checkTyreStatus());
    }

    @Test
    public void canCheckTyreStatusPoor() {
        grippyTyre.wearDown();
        grippyTyre.wearDown();
        assertEquals("Change me!", grippyTyre.checkTyreStatus());
    }
}

