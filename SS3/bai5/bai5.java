package SS3.bai5;

import java.util.Arrays;

public class bai5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == bookId) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        n=n-1;
        return  n;
    }

    public static void main(String[] args) {
       int[] bookId = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
       int n=bookId.length;
        System.out.printf("%d\n",n);
       n=deleteBook(bookId,n,102);

       System.out.printf(Arrays.toString(bookId));
       System.out.printf("/n%d",n);
    }
}
