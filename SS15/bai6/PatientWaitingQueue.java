package SS15.bai6;

import java.util.*;

class PatientWaitingQueue {
    private Queue<Patient> waitingQueue = new LinkedList<>();
    private int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient callNext() {
        if (!waitingQueue.isEmpty()) {
            totalPatients--;
            return waitingQueue.poll();
        }
        return null;
    }

    public void displayQueue() {
        for (Patient p : waitingQueue) {
            p.display();
        }
        System.out.println("Total: " + totalPatients);
    }
}
