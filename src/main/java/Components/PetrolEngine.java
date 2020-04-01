package Components;

import Behaviours.IEngine;

public class PetrolEngine implements IEngine {
    public String start() {
        return "VROOOOOOOM, VROOOOM";
    }

    public String stop() {
        return "moooorv.";
    }
}
