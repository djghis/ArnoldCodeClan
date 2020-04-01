package Components;

public class Gearbox {
    private int currentGear;
    private int topGear;

    public Gearbox(int topGear) {
        this.currentGear = 0;
        this.topGear = topGear;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    public int getTopGear() {
        return this.topGear;
    }

    public void nextGear() {
        if (this.currentGear < this.topGear) {
            this.currentGear += 1;
        }
    }

    public void downGear() {
        if (this.currentGear > 0) {
            this.currentGear -= 1;
        }
    }
}
