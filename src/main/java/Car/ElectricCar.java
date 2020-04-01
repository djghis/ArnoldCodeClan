package Car;

import Behaviours.IEngine;
import Behaviours.ITyreType;
import Components.Gearbox;

import java.util.ArrayList;

public class ElectricCar extends Car {
    private IEngine engine;

    public ElectricCar (Gearbox gearBox, ArrayList<ITyreType> tyres, IEngine engine) {
        super(gearBox, tyres);
        this.engine = engine;
    }

    public String start() {
        return this.engine.start();
    }

    public String stop() {
        return this.engine.stop();
    }



}
