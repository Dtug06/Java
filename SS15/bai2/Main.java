package SS15.bai2;

// Main.java
public class Main {
    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("P01", "Nguyễn Văn A", 30));
        pq.addPatient(new Patient("P02", "Trần Thị B", 25));
        pq.addPatient(new Patient("P03", "Lê Văn C", 40));

        pq.displayQueue();

        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(pq.peekNextPatient());

        System.out.println("\nGọi khám:");
        pq.callNextPatient();

        pq.displayQueue();
    }
}
