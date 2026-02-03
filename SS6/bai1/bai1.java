package SS6.bai1;

import java.util.Scanner;

class Student {
    String msv;
    String hoTen;
    int year;
    int avgs;

    void display() {
        System.out.printf("%s, %s, %d, %d\n", msv, hoTen, year, avgs);
    }
}
public class bai1 {
    public static void main(String []args){
     Student sv=new Student();
     Student sv1=new Student();
     sv.msv="Sv001";
     sv.hoTen="Nguyen Van A";
     sv.year=2006;
     sv.avgs=8;
     sv1.msv="Sv002";
     sv1.hoTen="Nguyen Van B";
     sv1.year=2006;
     sv1.avgs=8;

     sv.display();
     sv1.display();
    }
}
