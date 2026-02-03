package SS3.bai6;

import java.util.Arrays;

public class bai6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0;
        int[] temp = new int[a.length + b.length];
        int k = 0;

        // Duyệt cả hai mảng song song
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                // thêm phần tử từ a nếu chưa trùng
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
            } else if (a[i] > b[j]) {
                // thêm phần tử từ b nếu chưa trùng
                if (k == 0 || temp[k - 1] != b[j]) {
                    temp[k++] = b[j];
                }
                j++;
            } else {
                // a[i] == b[j] → thêm một lần duy nhất
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        // Thêm phần còn lại của mảng a
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        // Thêm phần còn lại của mảng b
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        // Sao chép kết quả thực tế sang mảng mới có đúng kích thước
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        int[] arrayFirst = {101, 103, 105, 110, 115};
        int[] arraySecond = {102, 103, 106, 110, 120};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Danh sách sách hoàn chỉnh của thư viện:");
        System.out.println(Arrays.toString(arrayMerge));
    }
}
