package SS4.bai6;

import java.util.regex.*;
import java.util.*;

public class bai6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc. Tuy nhiên một số phần cũng có giá trị.";

        List<String> blacklist = Arrays.asList("tệ", "ngu ngốc", "không đáng đọc");

        for (String word : blacklist) {
            String regex = "(?i)\\b" + Pattern.quote(word) + "\\b"; // (?i) = không phân biệt hoa thường
            review = review.replaceAll(regex, repeatAsterisks(word.length()));
        }

        if (review.length() > 200) {
            int cutIndex = 200;
            while (cutIndex > 0 && !Character.isWhitespace(review.charAt(cutIndex))) {
                cutIndex--;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(review.substring(0, cutIndex).trim()).append("...");
            review = sb.toString();
        }

        System.out.println("Review sau khi xử lý: " + review);
    }

    private static String repeatAsterisks(int length) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stars.append("*");
        }
        return stars.toString();
    }
}

