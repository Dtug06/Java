package SS16.btth;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Mouse", 500000, 6));
        repo.add(new FoodProduct("F01", "Milk", 30000, 10));
        repo.add(new FoodProduct("F02", "Cake", 50000, 20));

        System.out.println("---Danh sach san pham---");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Final Price: " + p.calculateFinalPrice());
            System.out.println("-----------------------");
        }

        System.out.println("---Tim san pham---");
        Product found = repo.findById("E01");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Khong tim thay!");
        }

        System.out.println("---Sap xep theo gia tang dan---");
        List<Product> sortedList = new ArrayList<>(repo.findAll());
        Collections.sort(sortedList, Comparator.comparingDouble(Product::getPrice));

        for (Product p : sortedList) {
            System.out.println(p.getId() + " - " + p.getPrice());
        }

        System.out.println("---Thong ke---");
        Map<String, Integer> stats = repo.statisticsByType();
        for (String key : stats.keySet()) {
            System.out.println(key + ": " + stats.get(key));
        }
    }
}
