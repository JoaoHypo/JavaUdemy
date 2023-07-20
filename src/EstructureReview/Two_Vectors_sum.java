package EstructureReview;

import java.util.Scanner;

public class Two_Vectors_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE HOW MANY NUMBERS: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double[] vect2 = new double[n];
        double[] result = new double[n];

        System.out.println("TYPE VECTOR A VALUES:");
        for (int i = 0; i< vect.length ; i++){
            System.out.printf("TYPE THE %dth NUMBER: ",i+1);
            vect[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println();
        System.out.println("TYPE VECTOR B VALUES:");
        for (int i = 0; i< vect2.length ; i++){
            System.out.printf("TYPE THE %dth NUMBER: ",i+1);
            vect2[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println();

        System.out.println("RESULTING VECTOR:");
        for (int i = 0; i< result.length ; i++){
            result[i] = vect[i] + vect2[i];
            System.out.printf("%.1f%n",result[i]);
            }

    }
}
