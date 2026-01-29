package SS4.bai4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ: ");
        String card = sc.nextLine();

        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(card);

        if (matcher.matches()) {
            String prefix = card.substring(0, 2);
            String yearStr = card.substring(2, 6);
            int year = Integer.parseInt(yearStr);

            if (!prefix.equals("TV")) {
                System.out.println(" Thiếu tiền tố TV");
            } else if (year < 2000 || year > 2026) {
                System.out.println(" Năm không hợp lệ");
            } else {
                System.out.println(" Mã thẻ hợp lệ");
            }
        } else {
            System.out.println(" Sai định dạng mã thẻ");
        }

        sc.close();
    }
}
