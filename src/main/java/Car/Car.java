package Car;

import Behaviours.IEngine;
import Behaviours.ITyreType;
import Components.Gearbox;

import java.util.ArrayList;

public abstract class Car {
    private Gearbox gearBox;
    private ArrayList<ITyreType> tyres;

    public Car (Gearbox gearBox, ArrayList<ITyreType> tyres) {
        this.gearBox = gearBox;
        this.tyres = tyres;
    }



    public abstract String start();

    public void move() {
        for (ITyreType tyre: tyres) {
            tyre.wearDown();
        }
    }

    public abstract String stop();
}
