package SS15.bai6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== DANH SÁCH BỆNH NHÂN CHỜ KHÁM ===");
        PatientWaitingQueue patientQueue = new PatientWaitingQueue();

        patientQueue.addPatient(new Patient("P01", "Tuấn", 20, "Nam"));
        patientQueue.addPatient(new Patient("P02", "Lan", 25, "Nữ"));
        patientQueue.addPatient(new Patient("P03", "Minh", 30, "Nam"));

        patientQueue.displayQueue();

        System.out.println("\nGọi bệnh nhân:");
        Patient next = patientQueue.callNext();
        if (next != null) next.display();

        patientQueue.displayQueue();


        System.out.println("\n=== LỊCH SỬ CHỈNH SỬA BỆNH ÁN ===");
        MedicalRecordHistory history = new MedicalRecordHistory("R001");

        history.addEdit(new EditAction("Thêm chẩn đoán", "Bác sĩ A", "10:00"));
        history.addEdit(new EditAction("Cập nhật thuốc", "Bác sĩ B", "10:05"));
        history.addEdit(new EditAction("Thêm xét nghiệm", "Bác sĩ C", "10:10"));

        history.displayHistory();

        System.out.println("\nUndo chỉnh sửa:");
        EditAction undo = history.undo();
        if (undo != null) undo.display();

        System.out.println("Sau khi undo:");
        history.displayHistory();


        System.out.println("\n=== HỆ THỐNG GỌI SỐ ===");
        TicketSystem ticketSystem = new TicketSystem();

        ticketSystem.issueTicket("09:00");
        ticketSystem.issueTicket("09:05");
        ticketSystem.issueTicket("09:10");

        ticketSystem.displayQueue();

        System.out.println("\nGọi số tiếp theo:");
        Ticket t = ticketSystem.callNext();
        if (t != null) t.display();

        System.out.println("Danh sách còn lại:");
        ticketSystem.displayQueue();


        System.out.println("\n=== UNDO NHẬP LIỆU ===");
        UndoManager undoManager = new UndoManager(5);

        undoManager.addAction(new InputAction("Tên", "Tuấn", "Anh Tuấn", "11:00"));
        undoManager.addAction(new InputAction("Tuổi", "20", "21", "11:01"));
        undoManager.addAction(new InputAction("Địa chỉ", "HN", "Hà Nội", "11:02"));

        System.out.println("Undo:");
        InputAction action = undoManager.undo();
        if (action != null) action.display();

        System.out.println("Undo lần 2:");
        action = undoManager.undo();
        if (action != null) action.display();
    }
}
