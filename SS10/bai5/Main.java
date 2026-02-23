package SS10.bai5;

public class Main {

    abstract static class Employee {
        protected String name;
        protected double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        abstract double calculateSalary();
    }

    interface BonusCalculator {
        double getBonus();
    }

    static class OfficeStaff extends Employee {

        public OfficeStaff(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        double calculateSalary() {
            return baseSalary;
        }
    }

    static class Manager extends Employee implements BonusCalculator {

        public Manager(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        public double getBonus() {
            return baseSalary * 0.2;
        }

        @Override
        double calculateSalary() {
            return baseSalary + getBonus();
        }
    }

    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyễn Văn A", 8000);
        Employee manager = new Manager("Trần Văn B", 15000);

        System.out.println("===== BẢNG LƯƠNG =====");

        System.out.println(staff.name + " - Lương: " + staff.calculateSalary());

        System.out.println(manager.name + " - Lương: " + manager.calculateSalary());
    }
}
