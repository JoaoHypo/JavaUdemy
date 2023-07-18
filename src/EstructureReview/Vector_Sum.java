package EstructureReview;

import java.util.Scanner;

public class Vector_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE NUMBER OF NUMBERS: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i< vect.length ; i++){
            System.out.printf("TYPE THE %dth NUMBER: ",i+1);
            vect[i] = sc.nextDouble();
        }
        System.out.print("VALUES:  ");
        for (int i = 0; i< vect.length ; i++){
            System.out.printf("%.1f  ",vect[i]);
        }
        double average = 0;
        for (int i = 0; i< vect.length ; i++){
            average += vect[i];
        }

        System.out.printf("%nSUM = %.2f",average);
        System.out.printf("%nAVERAGE =  %.2f",average/vect.length);

    }
}
