import Components.SlickTyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlickTyreTest {


    private SlickTyre slickTyre;

    @Before
    public void setUp(){
        slickTyre = new SlickTyre(25);
    }

    @Test
    public void canGetType(){
        assertEquals("Slick", slickTyre.getType());
    }

    @Test
    public void canGetWearLevel(){
        assertEquals(25, slickTyre.getWearLevel());
    }

    @Test
    public void canWearDown(){
        slickTyre.wearDown();
        assertEquals(20, slickTyre.getWearLevel());
    }

    @Test
    public void canWearDownIfDestroyed(){
        slickTyre.wearDown();
        slickTyre.wearDown();
        slickTyre.wearDown();
        slickTyre.wearDown();
        slickTyre.wearDown();
        slickTyre.wearDown();
        assertEquals(0, slickTyre.getWearLevel());
    }

    @Test
    public void canCheckTyreIsGood(){
        assertEquals("All Good!", slickTyre.checkTyreStatus());
    }

    @Test
    public void canCheckTyreIsDead(){
        slickTyre.wearDown();
        slickTyre.wearDown();
        slickTyre.wearDown();
        assertEquals("Change Me!", slickTyre.checkTyreStatus());

    }

}
