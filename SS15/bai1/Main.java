package SS15.bai1;


public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Thêm chẩn đoán", "10:00"));
        history.addEdit(new EditAction("Cập nhật thuốc", "10:05"));
        history.addEdit(new EditAction("Sửa liều lượng", "10:10"));

        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nUndo:");
        history.undoEdit();

        history.displayHistory();
    }
}
