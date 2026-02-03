package SS2;
import  java.util.Scanner;
public class bai6 {
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        int max=0;
        int min=999;
        for (int i=0;i<7;i++){
            int temp;
            System.out.print("Nhap so luong muon sach\t\n");
            temp=sc.nextInt();
            if(temp==0){
                continue;
            }
            if(temp>max){
                max=temp;
            }
            if(temp<min){
                min=temp;
            }
        }
        System.out.printf("Luot muon cao nhat: %d \n",max);
        System.out.printf("Luot muon thap nhat: %d \n",min);
        System.out.printf("Trung binh muon/ngay: %d \n",(max+min)/2);
    }
}
