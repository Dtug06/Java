package SS15.bai5;

import java.util.Queue;
import java.util.LinkedList;

class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        cases.add(c);
    }

    public EmergencyCase getNextCase() {
        return cases.poll();
    }

    public void displayQueue() {
        for (EmergencyCase c : cases) {
            c.displayPatient();
        }
    }
}

