package OOB;

import entities.Pi;

import java.util.Scanner;

public class PiEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pi circ = new Pi();

        System.out.print("Enter radius: ");
        circ.radius = (sc.nextDouble());
        sc.nextLine();

        System.out.println(circ);
        System.out.println(Pi.pi);
        sc.close();
    }
}
