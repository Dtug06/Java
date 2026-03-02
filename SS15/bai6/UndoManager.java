package SS15.bai6;

import java.util.*;

class UndoManager {
    private Stack<InputAction> undoStack = new Stack<>();
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction a) {
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0);
        }
        undoStack.push(a);
    }

    public InputAction undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return null;
    }
}
