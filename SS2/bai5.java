package SS2;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reputation_score = 100;
        int day = 0;
        while (day != 999) {
            int dayTemp;
            System.out.print("So ngay tre lan nay\t \n");
            dayTemp = sc.nextInt();
            if (dayTemp == 999) {
                day = dayTemp;
                break;
            }
            System.out.printf("Tra tre %d :- %d diem", dayTemp, dayTemp * 2);
            reputation_score = reputation_score + (-dayTemp * 2);
        }
        System.out.printf("Tong diem uy tin la %d\t", reputation_score);
        if (reputation_score < 80) {
            System.out.print("Doc gia can luu y\n");
        } else if (reputation_score > 80) {
            System.out.print("Doc gia uy tin tot y\n");
        }
    }
}
