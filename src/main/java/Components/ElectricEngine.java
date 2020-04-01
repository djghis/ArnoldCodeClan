package Components;

import Behaviours.IEngine;

public class ElectricEngine implements IEngine {


    public String start() {
        return "I am on!";
    }

    public String stop() {
        return "I am switching off!";
    }
}
