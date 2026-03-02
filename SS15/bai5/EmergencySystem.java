package SS15.bai5;

public class EmergencySystem {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        // tạo bệnh nhân
        Patient p1 = new Patient("P01", "An", 25);
        Patient p2 = new Patient("P02", "Binh", 40);

        // tạo ca
        EmergencyCase c1 = new EmergencyCase(p1);
        EmergencyCase c2 = new EmergencyCase(p2);

        queue.addCase(c1);
        queue.addCase(c2);

        System.out.println("Danh sách chờ:");
        queue.displayQueue();

        // xử lý ca đầu
        EmergencyCase current = queue.getNextCase();

        current.addStep(new TreatmentStep("Tiếp nhận", "10:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "10:05"));
        current.addStep(new TreatmentStep("Điều trị", "10:15"));

        current.displaySteps();

        // undo
        System.out.println("\nUndo bước gần nhất:");
        current.undoStep();

        current.displaySteps();
    }
}