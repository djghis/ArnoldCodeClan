import Components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolEngineTest {
    private PetrolEngine petrolEngine;

    @Before
    public void before() {
        petrolEngine = new PetrolEngine();
    }

    @Test
    public void canStart(){
        assertEquals("VROOOOOOOM, VROOOOM", petrolEngine.start());
    }

    @Test
    public void canStop(){
        assertEquals("moooorv.", petrolEngine.stop());
    }
}
