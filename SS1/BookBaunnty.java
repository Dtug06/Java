package SS1;

import java.util.Scanner;
public class BookBaunnty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So ngay cham \n");
        int day=sc.nextInt();
        System.out.print("So luong sach muong \n");
        int quantity=sc.nextInt();
        double total=day*quantity*5000;
        if (day>7 &&quantity>=3){
            total=total*1.2;
        }
        System.out.printf("So tien can tra %f",total);
        System.out.print(total>50000?"yeu cau khoa the":"yeu cau mo the");
    }
}
