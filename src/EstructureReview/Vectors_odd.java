package EstructureReview;

import java.util.Scanner;

public class Vectors_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE HOW MANY NUMBERS: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i< vect.length ; i++){
            System.out.printf("TYPE THE %dth NUMBER: ",i+1);
            vect[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println();
        int c = 0;
        System.out.println("ODD NUMBERS:");
        for (int i = 0; i< vect.length ; i++){
            if (vect[i]%2==0){
                System.out.printf("%d  ",vect[i]);
                c++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("NUMBER OF OOD NUMBERS = %d",c);
    }
}
