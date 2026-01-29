package SS3.bai4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bai4 {
    public static void sortBook(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr){
    System.out.print("Mang sau khi sap xep:\t");
    System.out.print(Arrays.toString(arr));
    }
    public static void main (String[] args ){
    int[] quantities = { 5, 10, 7, 8, 12, 6, 9, 4, 11, 3 };
     System.out.print(Arrays.toString(quantities));
     sortBook(quantities);
     displayBooks(quantities);
    }
}
