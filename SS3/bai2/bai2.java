package SS3.bai2;

import java.util.Scanner;

public class bai2 {
    public static String[] addBookLibraries(int n){
        Scanner sc =new Scanner(System.in);
        String[] arrBook=new String[n];
        System.out.printf("Nhap ma so cho %d cuon sach\t ",n);
        for (int i=0;i<n;i++){
            System.out.printf("Nhap ma so sach cho sach so %d:\t",i+1);
            arrBook[i]=sc.next();
        }
        return arrBook;
    }
    public static int searchBooks(String[] arr, String search){
      int flag=-1;
      for (int i=0;i<arr.length;i++){
          if(arr[i].equals(search)){
              flag=i;
              break;
          }
      }
      return flag;
    }
    public static void main(String[] args ){
     Scanner sc =new Scanner(System.in);
     String search;
     int n;
     System.out.print("Nhap so luong sach\t");
     n= sc.nextInt();
     System.out.print("Nhap chuoi can tim \t");
     search=sc.next();
     int isTrue=searchBooks(addBookLibraries(n),search);
     if(isTrue!=-1){
         System.out.printf("Tim thay %s tai vi tri %d",search,isTrue);
     }else {
         System.out.print("Khong tim thay ");
     }
    }
}
