package SS15.bai5;

import java.util.Stack;

class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        steps = new Stack<>();
    }

    // thêm bước
    public void addStep(TreatmentStep step) {
        steps.push(step);
    }

    // undo
    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            return steps.pop();
        }
        return null;
    }

    // hiển thị
    public void displaySteps() {
        System.out.println("Treatment for: " + patient.getName());
        for (TreatmentStep s : steps) {
            s.display();
        }
    }

    public void displayPatient() {
        patient.display();
    }
}
