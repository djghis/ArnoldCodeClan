import Behaviours.IEngine;
import Behaviours.ITyreType;
import Car.HybridCar;
import Components.ElectricEngine;
import Components.Gearbox;
import Components.GrippyTyre;
import Components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar hybridCar;
    private Gearbox gearbox;

    private ArrayList<ITyreType> tyres;
    private GrippyTyre tyre1;
    private GrippyTyre tyre2;
    private GrippyTyre tyre3;
    private GrippyTyre tyre4;

    private ArrayList<IEngine> engines;
    private ElectricEngine electricEngine;
    private PetrolEngine petrolEngine;


    @Before
    public void before(){
        tyre1 = new GrippyTyre(100);
        tyre2 = new GrippyTyre(100);
        tyre3 = new GrippyTyre(100);
        tyre4 = new GrippyTyre(100);
        tyres = new ArrayList<ITyreType>();
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);
        engines = new ArrayList<IEngine>();
        electricEngine = new ElectricEngine();
        petrolEngine = new PetrolEngine();
        engines.add(electricEngine);
        engines.add(petrolEngine);
        gearbox = new Gearbox(6);

        hybridCar = new HybridCar(gearbox, tyres, engines );
    }

    @Test
    public void canStart() {
        assertEquals("I am on!", hybridCar.start());
    }

    @Test
    public void canStop() {
        assertEquals("I am switching off!", hybridCar.stop());
    }
}
