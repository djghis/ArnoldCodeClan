import Behaviours.IEngine;
import Behaviours.ITyreType;
import Car.ElectricCar;
import Components.ElectricEngine;
import Components.Gearbox;
import Components.SlickTyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    private Gearbox gearbox;
    private SlickTyre tyre1;
    private SlickTyre tyre2;
    private SlickTyre tyre3;
    private SlickTyre tyre4;
    private ArrayList<ITyreType> tyres;
    private ElectricEngine engine;
    private ElectricCar electricCar;

    @Before
    public void before() {
        gearbox = new Gearbox(7);
        tyre1 = new SlickTyre(100);
        tyre2 = new SlickTyre(100);
        tyre3 = new SlickTyre(90);
        tyre4 = new SlickTyre(90);
        tyres = new ArrayList<ITyreType>();
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);
        engine = new ElectricEngine();

        electricCar = new ElectricCar(gearbox, tyres, engine);
    }

    @Test
    public void canStart() {
        assertEquals("I am on!", electricCar.start());
    }

    @Test
    public void canStop() {
        assertEquals("I am switching off!", electricCar.stop());
    }

}
