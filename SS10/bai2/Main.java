package SS10.bai2;


public class Main {


    abstract static class Vehicle {
        protected String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        abstract void move();
    }

    static class Car extends Vehicle {

        public Car(String brand) {
            super(brand);
        }

        @Override
        void move() {
            System.out.println(brand + " - Cách di chuyển: Di chuyển bằng động cơ");
        }
    }

    static class Bicycle extends Vehicle {

        public Bicycle(String brand) {
            super(brand);
        }

        @Override
        void move() {
            System.out.println(brand + " - Cách di chuyển: Di chuyển bằng sức người");
        }
    }

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Giant");

        car.move();
        bicycle.move();
    }
}
