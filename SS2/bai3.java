package SS2;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap luong sach tra muon");
        int n= sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++){
            int temp;
            System.out.printf("Sp ngay tre cua cuon sach %d \n",i+1);
           temp= sc.nextInt();
           total=total+temp;
        }

        System.out.printf("Tong so tien phat la %d",total*5000);
    }
}
