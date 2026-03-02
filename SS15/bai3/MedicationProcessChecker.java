package SS15.bai3;

// MedicationProcessChecker.java
import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack;

    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    // kiểm tra quy trình
    public boolean checkProcess(String[] actions) {

        reset(); // đảm bảo Stack sạch

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equals("PUSH")) {
                stack.push(action);
                System.out.println("Phát thuốc (PUSH)");
            }

            else if (action.equals("POP")) {

                if (stack.isEmpty()) {
                    System.out.println(" Lỗi: POP khi chưa phát thuốc (Stack rỗng) tại bước " + (i + 1));
                    return false;
                }

                stack.pop();
                System.out.println("Hoàn tất phát thuốc (POP)");
            }

            else {
                System.out.println(" Hành động không hợp lệ: " + action);
                return false;
            }
        }

        // kiểm tra cuối ca
        if (!stack.isEmpty()) {
            System.out.println(" Lỗi: Ca trực kết thúc nhưng vẫn còn thuốc chưa hoàn tất.");
            return false;
        }

        System.out.println(" Quy trình hợp lệ.");
        return true;
    }

    // reset Stack
    public void reset() {
        stack.clear();
    }
}
