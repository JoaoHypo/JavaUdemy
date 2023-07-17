package EstructureReview;

import java.util.Scanner;

public class VectorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE NUMBER OF NUMBERS: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i< vect.length ; i++){
            System.out.printf("TYPE THE %dth NUMBER: ",i+1);
            vect[i] = sc.nextDouble();
        }
        System.out.println("NEGATIVE NUMBERS:");
        for (int i = 0; i< vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}
