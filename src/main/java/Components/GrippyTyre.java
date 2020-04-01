package Components;

import Behaviours.ITyreType;

public class GrippyTyre implements ITyreType {
    private String type;
    private int wearLevel;

    public GrippyTyre(int wearLevel) {
        this.type = "Grippy";
        this.wearLevel = wearLevel;
    }

    public String getType() {
        return this.type;
    }

    public int getWearLevel() {
        return this.wearLevel;
    }

    public void wearDown() {
        if (this.wearLevel > 0) {
            this.wearLevel -= 10;
        }
    }

    public String checkTyreStatus() {
        if (this.wearLevel <= 20){
            return "Change me!";
        } else {
            return "All good!";
        }
    }
}
