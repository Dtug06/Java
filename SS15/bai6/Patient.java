package SS15.bai6;

class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println(id + " - " + name + " - " + age + " - " + gender);
    }
}