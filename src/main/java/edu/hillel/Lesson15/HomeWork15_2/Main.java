package edu.hillel.Lesson15.HomeWork15_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Book", 300, 0, LocalDateTime.now().minusMonths(3)));
        products.add(new Product(2,"Book", 60, 10, LocalDateTime.now()));
        products.add(new Product(3,"Phone", 500, 15, LocalDateTime.now()));
        products.add(new Product(4,"Laptop", 1000, 0, LocalDateTime.now().plusMonths(5)));
        products.add(new Product(5,"Book", 70, 30, LocalDateTime.now()));
        products.add(new Product(6, "Book", 100, 0, LocalDateTime.now()));
        products.add(new Product(7, "Toy", 150, 0, LocalDateTime.now()));
        products.add(new Product(8, "Book", 120, 0, LocalDateTime.now()));
        products.add(new Product(9, "Toy", 80, 0, LocalDateTime.now()));

        List<Product> expensiveBooks = Product.getExpensiveBook(products);
        //1
        System.out.println("1.Книги дороже 250.");
        expensiveBooks.forEach(product -> System.out.println("Type: " + product.getType() +
                ", Price: " + product.getPrice()));
       //2
        System.out.println("----------");
        System.out.println("2.Книги со скидкой.");
        List<Product> booksWithDiscount = Product.getBooksWithDiscount(products);
        booksWithDiscount.forEach(product -> System.out.println(
                "Type: " + product.getType() + ", Price: " + product.getPrice()
                        + ", Discount: " + product.getDiscount()));
        //3
        System.out.println("----------");
//        List<Product> products1 = new ArrayList<>();
        System.out.println("3.Самые дешевые книги.");
        try {
            Product cheapestBook = Product.findCheapestBook( products/*products1*/);
            System.out.println("Найдешевший продукт з категорії 'Book': " + cheapestBook.getPrice());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
//4
        System.out.println("----------");
        System.out.println("4.Последние три добавленные товара.");
        List<Product> lastThreeAddedProducts = Product.getLastThreeAddedProducts(products);
        for(Product product : lastThreeAddedProducts){
            System.out.println("Type:" + product.getType() +", Price: " + product.getPrice()
                    + ", Discount:" + product.getDiscount() + ", Added Date: " + product.getAddedDate());
        }
        //5
        System.out.println("----------");
        System.out.println("5.Общая стоимость товаров.");
        double totalPrice = Product.calculateTotalPrice(products);
        System.out.println("Общая стоимость конкретных товаров: " + totalPrice);
        //6
        System.out.println("----------");
        System.out.println("Продукты сгрупированные по type");
        Map<String, List<Product>> groupedProducts = Product.groupProductsByType(products);
        groupedProducts.forEach((type, productsList) ->{
            System.out.println(type +": ");
            productsList.forEach(product -> System.out.println(" " + product.toString()));
        });
    }

}
