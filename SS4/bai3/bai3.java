package SS4.bai3;

public class bai3 {
    public static void main(String[] Args) {
        String[] giaoDich = {
                "MM001–02/01",
                "MM002–03/01",
                "MM003–05/01",
                "MM004–06/01",
                "MM005–08/01",
                "MM006–10/01",
                "MM007–12/01",
                "MM008–15/01",
                "MM009–18/01",
                "MM010–20/01"
        };
        StringBuilder sb = new StringBuilder();
        for(String items : giaoDich){
            sb=sb.append("Giao dich :").append(items).append("\n");
        }
        System.out.printf(sb.toString());
    }
}
