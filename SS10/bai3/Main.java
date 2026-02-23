package SS10.bai3;

public class Main {

    abstract static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    interface Swimmable {
        void swim();
    }

    interface Flyable {
        void fly();
    }

    static class Duck extends Animal implements Swimmable, Flyable {

        public Duck(String name) {
            super(name);
        }

        @Override
        public void swim() {
            System.out.println(name + " đang bơi");
        }

        @Override
        public void fly() {
            System.out.println(name + " đang bay");
        }
    }

    static class Fish extends Animal implements Swimmable {

        public Fish(String name) {
            super(name);
        }

        @Override
        public void swim() {
            System.out.println(name + " đang bơi");
        }
    }

    public static void main(String[] args) {

        Duck duck = new Duck("Vịt trời");
        Fish fish = new Fish("Cá chép");

        duck.swim();
        duck.fly();

        System.out.println();

        fish.swim();
    }
}
