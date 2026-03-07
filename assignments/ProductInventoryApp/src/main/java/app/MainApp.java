package app;

import dao.ProductDao;
import model.Product;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDao dao = new ProductDao();

        while (true) {

            System.out.println("\n PRODUCT INVENTORY MENU ");
            System.out.println("1 Add Product");
            System.out.println("2 View All Products");
            System.out.println("3 View Product By ID");
            System.out.println("4 Update Product Price");
            System.out.println("5 Update Product Quantity");
            System.out.println("6 Delete Product");
            System.out.println("7 Search Product By Name");
            System.out.println("8 Show Low Stock Products");
            System.out.println("9 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Category: ");
                    String cat = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();

                    dao.addProduct(new Product(id, name, cat, price, qty, rating));
                    break;

                case 2:
                    dao.viewAllProducts();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    dao.viewProductById(sc.nextInt());
                    break;

                case 9:
                    System.exit(0);
            }
        }
    }
}