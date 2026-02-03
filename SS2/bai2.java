package SS2;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ky tu \n");
        char charecter =sc.next().charAt(0);
        charecter=Character.toLowerCase(charecter);
    switch (charecter){
        case 'a':
            System.out.print("Tang 1: Sach van hoc\n");
            break;
        case 'b':
            System.out.print("Tang 2: Sach sach khoa hoc\n");
            break;
        case 'c':
            System.out.print("Tang 3: Sach ngoai ngu\n");
            break;
        case 'd':
            System.out.print("Tang 4: Sach tin hoc \n");
            break;
        default:
            System.out.print("Ma khu vuc khong hop le ");
    }
    }
}
