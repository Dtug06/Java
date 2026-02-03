package SS1;

import java.util.Scanner;

public class TranferMoney {
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);

        System.out.print("Ti gia do la \n");
        double dola=sc.nextDouble();
        System.out.print("Ti gia viet nam dong\n");
        float vietNamDong= (float)(dola*25450);
        System.out.printf("Gia chinh xac\t %.2f",vietNamDong);
        System.out.printf("Gia lam tron %d",(long)vietNamDong);

    }
}
