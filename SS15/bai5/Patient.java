package SS15.bai5;

class Patient {
    private String id;
    private String name;
    private int age;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
