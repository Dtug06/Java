package SS4.bai1;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args ){
        String name;
        String author,gerner;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ten sach, tac gia , the loai \n");
        name=sc.nextLine();
        author=sc.nextLine();
        gerner=sc.nextLine();

        name=name.trim();
        name=name.replaceAll("\\s+"," ");
        name=name.toUpperCase();


        author=author.trim();
        author=author.replaceAll("\\s+"," ");
        String[] words = author.split(" ");
        StringBuffer sb =new StringBuffer();
        for(String word :words){
            if(word.length()>0){
               sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        String authorFinal =sb.toString().trim();

        gerner=gerner.trim();
        gerner=gerner.replaceAll("\\s+"," ");

    System.out.printf("[%s]- Tac Gia : %s",name,authorFinal);

    }
}
