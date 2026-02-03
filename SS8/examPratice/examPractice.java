package SS8.examPratice;

import java.util.Scanner;


public class examPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudent manager = new ManagerStudent();
        int choice;

        do {
            System.out.print("===== QUẢN LÝ ĐIỂM SINH VIÊN =====\n");
            System.out.print("1. Nhập danh sách sinh viên \n");
            System.out.print("2. Hiển thị danh sách sinh viên \n");
            System.out.print("3. Tìm kiếm sinh viên theo Học lực \n");
            System.out.print("4. Sắp xếp theo học lực giảm dần\n");
            System.out.print("5. Thoát \n");
            System.out.print("==================================\n");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã SV: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên SV: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập điểm: ");
                    int score = sc.nextInt();
                    sc.nextLine();
                    manager.addStudent(new Student(id, name, score));
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
                    String rank = sc.nextLine();
                    manager.searchByRank(rank);
                    break;
                case 4:
                    manager.sortByScoreDesc();
                    manager.displayStudents();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
    }

}

