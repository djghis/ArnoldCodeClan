package Components;

import Behaviours.ITyreType;

public class SlickTyre implements ITyreType {

    private String type;
    private int wearLevel;

    public SlickTyre(int wearLevel){
        this.type = "Slick";
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
            this.wearLevel -= 5;
        }
    }

    public String checkTyreStatus() {
        if (this.wearLevel < 15){
            return "Change Me!";
        } else {
            return "All Good!";
        }
    }


}
