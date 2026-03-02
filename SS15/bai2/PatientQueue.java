package SS15.bai2;

// PatientQueue.java
import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // thêm bệnh nhân
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
    }

    // gọi khám
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân.");
            return null;
        }
        Patient next = queue.poll();
        System.out.println("Mời bệnh nhân: " + next);
        return next;
    }

    // xem bệnh nhân tiếp theo
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách trống.");
            return null;
        }
        return queue.peek();
    }

    // kiểm tra rỗng
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // hiển thị danh sách chờ
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân chờ.");
            return;
        }

        System.out.println("=== DANH SÁCH CHỜ ===");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}