package SS1;

public class SwapBookBai3 {
    public static void main(String[] args){
        String book1="Java Basic";
        String book2="Python Intro";

        System.out.print(book1);
        System.out.print(book2);
        String temp=book1;//temp trỏ tới book1
        book1=book2;// book1 bằng book2
        book2=temp;//book2 bằng temp (Java Basic)
    }
}
