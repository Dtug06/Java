package SS15.bai5;

class TreatmentStep {
    private String description;
    private String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public void display() {
        System.out.println(time + " - " + description);
    }
}
