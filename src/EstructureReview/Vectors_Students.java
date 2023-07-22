package EstructureReview;

import java.util.Scanner;

public class Vectors_Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("TYPE HOW MANY NUMBERS: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] vect = new String[10];

        for (int i = 0; i < n ; i++){
            System.out.printf("RENT %dth NUMBER: %n",i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            vect[room] = name+", "+email;
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10 ; i++){
            if (vect[i] != null){
            System.out.printf("%d: %s%n",i,vect[i]);}
        }
    }
}
