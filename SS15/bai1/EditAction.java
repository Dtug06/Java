package SS15.bai1;


public class EditAction {
    private String description;
    private String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    // getter
    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    // setter
    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // hiển thị
    @Override
    public String toString() {
        return "Mô tả: " + description + " | Thời gian: " + time;
    }
}
