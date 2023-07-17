package EstructureReview;

import java.util.Scanner;

public class Vector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE NUMBER OF PEOPLE: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i<n ; i++){
            System.out.printf("TYPE THE %dth HEIGHT: ",i+1);
            vect[i] = sc.nextDouble();
        }

        double average = 0;
        for (int i = 0; i<n ; i++){
            average += vect[i];
        }

        System.out.printf("AVERAGE HEIGHT: %.2f",average/n);

    }
        }
