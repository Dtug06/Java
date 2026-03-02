package SS15.bai4;

public class Main {
    public static void main(String[] args) {

        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient("E01", "Nguyễn A", 2);
        eq.addPatient("E02", "Trần B", 1);
        eq.addPatient("E03", "Lê C", 1);
        eq.addPatient("E04", "Phạm D", 2);

        System.out.println("\nGọi khám:");
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
    }
}