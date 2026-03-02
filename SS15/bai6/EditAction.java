package SS15.bai6;

class EditAction {
    private String description;
    private String editedBy;
    private String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public void display() {
        System.out.println(editTime + " - " + editedBy + ": " + description);
    }
}
