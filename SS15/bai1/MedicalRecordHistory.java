package SS15.bai1;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    // thêm chỉnh sửa
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã lưu chỉnh sửa: " + action);
    }

    // undo
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa để hoàn tác!");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Hoàn tác: " + removed);
        return removed;
    }

    // xem chỉnh sửa gần nhất
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Chưa có chỉnh sửa.");
            return null;
        }
        return history.peek();
    }

    // kiểm tra rỗng
    public boolean isEmpty() {
        return history.isEmpty();
    }

    // hiển thị lịch sử
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử trống.");
            return;
        }

        System.out.println("=== LỊCH SỬ CHỈNH SỬA ===");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
