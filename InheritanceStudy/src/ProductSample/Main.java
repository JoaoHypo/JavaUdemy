package ProductSample;

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
            System.out.println("Common, used or imported (c/u/i): ");
            char productType = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (productType == 'c'){
                productList.add(new Product(name,price));
            }
            else if (productType == 'u'){
                productList.add(new Product(name,price));
            }
            else if (productType == 'i'){
                productList.add(new Product(name,price));
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

        }




        sc.close();
    }
}
