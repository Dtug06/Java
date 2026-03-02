package SS15.bai4;

// EmergencyQueue.java
import java.util.PriorityQueue;

public class EmergencyQueue {

    private PriorityQueue<EmergencyPatient> queue;
    private int counter = 0; // đếm thứ tự đến

    public EmergencyQueue() {

        queue = new PriorityQueue<>(
                (p1, p2) -> {
                    if (p1.getPriority() != p2.getPriority()) {
                        return p1.getPriority() - p2.getPriority();
                    }
                    return p1.getOrder() - p2.getOrder();
                }
        );
    }

    public void addPatient(String id, String name, int priority) {
        EmergencyPatient p = new EmergencyPatient(id, name, priority, counter++);
        queue.offer(p);
        System.out.println("Đã thêm: " + p);
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân.");
            return null;
        }
        EmergencyPatient next = queue.poll();
        System.out.println("Mời khám: " + next);
        return next;
    }

    public void displayQueue() {
        System.out.println("=== Danh sách chờ ===");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}
