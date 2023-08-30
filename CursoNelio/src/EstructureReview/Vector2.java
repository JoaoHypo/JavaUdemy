package EstructureReview;

import entities.ProductVect;
import java.util.Scanner;

public class Vector2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE NUMBER OF PRODUCTS: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        ProductVect[] vect = new ProductVect[n];

        for (int i = 0; i< vect.length ; i++){

            System.out.printf("TYPE THE %dth PRODUCT NAME: ",i+1);
            String name = sc.nextLine();
            System.out.printf("TYPE THE %dth PRODUCT PRICE: ",i+1);
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            vect[i] = new ProductVect(name,price);
        }

        double average = 0;
        for (int i = 0; i< vect.length ; i++){
            average += vect[i].getPrice();
        }

        System.out.printf("AVERAGE PRICE: %.2f",average/ vect.length);

    }
        }
