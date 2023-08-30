package EstructureReview;

import java.util.Scanner;

public class Vectors_higher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE HOW MANY NUMBERS: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i< vect.length ; i++){
            System.out.printf("TYPE THE %dth NUMBER: ",i+1);
            vect[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println();

        int c = 0;
        double higher = vect[0];

        for (int i = 0; i< vect.length ; i++){
            if (vect[i]>higher){
                higher = vect[i];
                c = i;

            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("HIGHER VALUE = %.1f%n",higher);
        System.out.printf("HIGHER VALUE POSITION IN VECTOR = %d",c);
    }
}
