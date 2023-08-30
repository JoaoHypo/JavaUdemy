package EstructureReview;

import entities.People;
import entities.ProductVect;

import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE NUMBER OF PEOPLE: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        People[] vect = new People[n];

        for (int i = 0; i< vect.length ; i++){

            System.out.printf("TYPE THE %dth PERSON DATA: ",i+1);
            System.out.println();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Age:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Height:");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            vect[i] = new People(name,age,height);
        }
        double c = 0;
        double average = 0;
        for (int i = 0; i< vect.length ; i++){
            average += vect[i].getHeight();
            if (vect[i].getAge() < 16){
                c ++;
            }
        }
        System.out.printf("AVERAGE HEIGHT: %.2f%n",average/ vect.length);
        System.out.printf("PEOPLE WITH LESS THAN 16 YEARS OLD: %.1f%%%n",c/vect.length*100); //double %% , new stuff

        for (int i = 0; i< vect.length ; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
    }
}
