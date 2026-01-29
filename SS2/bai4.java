package SS2;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhap id sach moi \t");
            id= sc.nextInt();
            if (id > 0) {
                System.out.print("Luu ma sach thanh cong \n");
            } else {
                System.out.print("Ma khong hop le, hay nhap lai\n");
            }
        } while (id <= 0);
    }
}
