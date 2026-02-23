package SS10.bai6;

import java.util.*;

public class Main {

    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name + " - " + price;
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));
        products.add(new Product("Mouse", 50));

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("===== Sắp xếp theo giá tăng dần =====");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\n===== Sắp xếp theo tên A-Z =====");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
