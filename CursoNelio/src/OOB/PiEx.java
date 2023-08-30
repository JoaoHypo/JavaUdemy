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
        System.out.println(Pi.PI);

        System.out.print("Enter second radius - not instantiated: ");
        double circ2 = sc.nextDouble();
        System.out.printf("Circumference: %.2f%n",Pi.circumference(circ2));
        System.out.printf("Volume: %.2f%n",Pi.volume(circ2));
        sc.close();
    }
}
