package SS3.bai1;
import java.util.Scanner;
public class bai1 {
    public static int[] addBookToLibraries(int n){
        Scanner sc =new Scanner(System.in);
        int[] arrBook=new int[n];
        System.out.printf("Nhap ma so cho %d cuon sach\t ",n);
        for (int i=0;i<n;i++){
            System.out.printf("Nhap ma so sach cho sach so %d:\t",i+1);
            arrBook[i]=sc.nextInt();
        }
        return arrBook;
    }
    public static void displayLibraries(int[] arr){
        System.out.print("----Ket qua----\n");
        System.out.print("Danh sach ma sach:\t");
        for (int i=0;i<arr.length;i++){
            System.out.printf("%d",arr[i]);
            if(i<arr.length-1){
                System.out.print(",\t");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int []arr=new int[100];
        int n;
        System.out.print("Nhap so luong sach can quan ly:\t");
        n=sc.nextInt();
        arr=addBookToLibraries(n);
        displayLibraries(arr);
    }
}
