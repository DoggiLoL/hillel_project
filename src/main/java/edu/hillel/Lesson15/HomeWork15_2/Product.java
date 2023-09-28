package edu.hillel.Lesson15.HomeWork15_2;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Product {

    private int id;
   private String type;
    private double price;

    private int discount;

    private LocalDateTime addedDate;

    public Product(int id, String type, double price, int discount, LocalDateTime addedDate) {
        this.id = id;
        this.type = type;
        if(discount > 0){
            this.price = price - ((price*discount)/100);
        } else{
            this.price = price;}
        this.discount = discount;
        this.addedDate = addedDate;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    //1
    public static List<Product> getExpensiveBook(List<Product> products){
        return products.stream()
                .filter(product -> product.getType().equals("Book")).
                filter(product -> product.getPrice() > 250)
                .filter(product -> product.getDiscount() == 0)
                .collect(Collectors.toList());
    }
    //2
    public static List<Product> getBooksWithDiscount(List<Product>products){
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getDiscount() == 10)
                .collect(Collectors.toList());
    }
//3
    public static Product findCheapestBook(List<Product> products){
        try {
            return products.stream()
                    .filter(product -> product.getType().equals("Book"))
                    .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                    .get();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Продукт [категорія: ім'я_категорії] не знайдено.");
        }
    }
//4
    public static List<Product> getLastThreeAddedProducts(List<Product> products){
        products.sort(Comparator.comparing(Product::getAddedDate).reversed());
        return products.subList(0, Math.min(3, products.size()));
    }

    public static double calculateTotalPrice(List<Product> products){
        LocalDateTime currentDataTime = LocalDateTime.now();
        return products.stream()
                .filter(product -> product.getAddedDate().getYear()== currentDataTime.getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice()<=75)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupProductsByType(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));

    }

    @Override
    public String toString(){
        return "Product{type='" + type + "', price=" + price + ", Discount=" + discount + ", addedDate=" + addedDate + '}';
    }

}
