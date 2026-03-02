package SS15.bai4;

// EmergencyPatient.java
public class EmergencyPatient {
    private String id;
    private String name;
    private int priority; // 1: cấp cứu, 2: thường
    private int order; // thứ tự đến

    public EmergencyPatient(String id, String name, int priority, int order) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.order = order;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getPriority() { return priority; }
    public int getOrder() { return order; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + name +
                " | Mức độ: " + (priority == 1 ? "Cấp cứu" : "Thường");
    }
}
