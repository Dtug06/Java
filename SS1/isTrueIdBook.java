package SS1;

import java.util.Scanner;
public class isTrueIdBook {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so nguyen 4 chu so\n");
        int n=sc.nextInt();
        if (n <1000 || n>9999){
            System.out.print("Out of range");
            return;
        }
        int thousands = (n / 1000) * 1000;
        int hundreds = ((n / 100) % 10) * 100;
        int tens = ((n / 10) % 10) * 10;
        int units = n % 10;

        int sumOfFirstThreeNumber=thousands + hundreds + tens +units;

        System.out.printf("So du chia lay du cho 10 %d",sumOfFirstThreeNumber%10);
    }
}
