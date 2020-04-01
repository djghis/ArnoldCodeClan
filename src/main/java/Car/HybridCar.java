package Car;

import Behaviours.IEngine;
import Behaviours.ITyreType;
import Components.Gearbox;

import java.util.ArrayList;

public class HybridCar extends Car {
    private ArrayList<IEngine> engines;
    private IEngine currentEngine;

    public HybridCar(Gearbox gearBox, ArrayList<ITyreType> tyres, ArrayList<IEngine> engines) {
        super(gearBox, tyres);
        this.engines = engines;
        this.currentEngine = this.engines.get(0);
    }


    public String start() {
        return this.currentEngine.start();
    }

    public String stop() {
        return this.currentEngine.stop();
    }

    public void changeEngine(int engineNumber) {
        this.stop();
        this.currentEngine = this.engines.get(engineNumber);
        this.start();
    }
}
