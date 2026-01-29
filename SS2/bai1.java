package SS2;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Nhap tuoi cua ban \n");
    int age= sc.nextInt();
    System.out.print("Nhap sos sach hien tai \n");
    int quantity =sc.nextInt();

    if(age >=18 && quantity<=3){
        System.out.print("Cho phep muon sach");
    }else {
        if(age <18){
            System.out.print("Tuoi nho hon 18 \t");
        }
        if(quantity>3){
            System.out.print("Vuot qua 3 cuon sach");
        }
    };
    }
}
