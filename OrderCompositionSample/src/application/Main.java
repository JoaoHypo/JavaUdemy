package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter birthDayFmt = Client.getBirthDayFmt();
        DateTimeFormatter orderFmt = Order.getOrderFmt();

        System.out.println("------------------");
        System.out.println("Enter client data");


        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.nextLine(),birthDayFmt);

        Client client = new Client(name,email,date);

        System.out.println("\n------------------");
        System.out.println("Enter order data:");


        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(LocalDateTime.now(),status,client);

        System.out.print("How many items to this order? ");
        int orders = sc.nextInt();
        sc.nextLine();

        System.out.println("\n------------------");
        for(int i =0 ; i < orders ; i++){
            System.out.printf("Enter #%d item data:%n",i+1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();
            System.out.println();

            Product product = new Product(productName,price);
            OrderItem orderItem = new OrderItem(product,quantity);
            order.addItem(orderItem);
        }

        System.out.println(order.toString());
        sc.close();
    }
}
