package SS15.bai2;

// Patient.java
public class Patient {
    private String id;
    private String name;
    private int age;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // hiển thị
    @Override
    public String toString() {
        return "ID: " + id + " | Tên: " + name + " | Tuổi: " + age;
    }
}