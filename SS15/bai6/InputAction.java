package SS15.bai6;

class InputAction {
    private String fieldName;
    private String oldValue;
    private String newValue;
    private String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    public void display() {
        System.out.println(fieldName + ": " + oldValue + " -> " + newValue + " (" + actionTime + ")");
    }
}
