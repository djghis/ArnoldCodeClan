import Components.ElectricEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {

    private ElectricEngine electricEngine;

    @Before
    public void before(){
        electricEngine = new ElectricEngine();
    }

    @Test
    public void canStart(){
        assertEquals("I am on!", electricEngine.start());
    }

    @Test
    public void canStop(){
        assertEquals("I am switching off!", electricEngine.stop());
    }
}
