package SS10.bai1;


import java.util.Scanner;


public class shape {


    interface Shape {
        double getArea();
        double getPerimeter();
    }


    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }


    static class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();

        Shape circle = new Circle(r);

        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());


        System.out.print("\nNhập chiều rộng hình chữ nhật: ");
        double w = sc.nextDouble();

        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double h = sc.nextDouble();

        Shape rectangle = new Rectangle(w, h);

        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
    }
}