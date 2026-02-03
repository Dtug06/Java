package SS1;

import java.util.Scanner;

class BookInfo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String bookId;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;
        System.out.print("Nhap id sach ");
        bookId =sc.nextLine();
        System.out.print("Nhap ten sach");
        bookName =sc.nextLine();
        System.out.print("Nhap nam ");
        publishYear= sc.nextInt();
        System.out.print("nhap gia");
        price=sc.nextDouble();
        System.out.print("Nhap co hop le hay khong");
        isAvailable=sc.nextBoolean();
        //tinh isVai
        System.out.println("Ten sach"+bookName.toUpperCase());
        System.out.printf("Tuoi cua sach %d ",2026-publishYear);
        System.out.printf("Gia tien %.2f",price);
        System.out.println(isAvailable?"con sach":"het sach");
    }
}