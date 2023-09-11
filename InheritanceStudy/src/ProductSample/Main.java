package ProductSample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = UsedProduct.getFmt();

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 0 ; i < numberOfProducts ; i++){
            System.out.printf("Product #%d data: %n",i+1);
            System.out.print("Common, used or imported (c/u/i): ");
            char productType = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (productType == 'c'){
                productList.add(new Product(name,price));
            }
            else if (productType == 'u'){
                System.out.print("Manufacture date (DD//MM/YYYY): ");
                productList.add(new UsedProduct(name,price,LocalDate.parse(sc.nextLine(),fmt)));
            }
            else if (productType == 'i'){
                System.out.print("Customs fee: ");
                productList.add(new ImportedProduct(name,price, sc.nextDouble()));
                sc.nextLine();
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product product : productList){
            System.out.print(product.priceTag());
        }
        sc.close();
    }
}
