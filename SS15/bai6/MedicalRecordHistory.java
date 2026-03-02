package SS15.bai6;

import java.util.*;

class MedicalRecordHistory {
    private Stack<EditAction> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction e) {
        editStack.push(e);
    }

    public EditAction undo() {
        if (!editStack.isEmpty()) {
            return editStack.pop();
        }
        return null;
    }

    public void displayHistory() {
        for (EditAction e : editStack) {
            e.display();
        }
    }
}
