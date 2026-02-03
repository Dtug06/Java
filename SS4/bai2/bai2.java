package SS4.bai2;

public class bai2 {
    public static void main(String[] args) {
        String description = "Sach giao khoa Toan lop 12, Kệ: A1-102, tinh trang moi ";

        int index = description.indexOf("Kệ:");
        if (index != -1) {
            int start = index + "Kệ:".length();

            int end = description.indexOf(",", start);

            if (end == -1) {
                end = description.length();
            }

            String viTriKe = description.substring(start, end).trim();
            System.out.println("Vị trí lưu trữ: " + viTriKe);

            String newDescription = description.substring(0, index)
                    + "Vị trí lưu trữ:"
                    + description.substring(start);
            System.out.println("Mô tả mới: " + newDescription.trim());
        } else {
            System.out.println("Không tìm thấy vị trí kệ sách");
        }
    }
}
