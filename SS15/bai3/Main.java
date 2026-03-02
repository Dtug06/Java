package SS15.bai3;


public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        String[] actions2 = {"POP", "PUSH"};
        String[] actions3 = {"PUSH", "PUSH", "POP"};

        System.out.println("=== Test 1 ===");
        checker.checkProcess(actions1);

        System.out.println("\n=== Test 2 ===");
        checker.checkProcess(actions2);

        System.out.println("\n=== Test 3 ===");
        checker.checkProcess(actions3);
    }
}
