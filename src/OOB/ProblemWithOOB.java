package OOB;
import entities.Triangle;
import java.util.Scanner;

public class ProblemWithOOB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure of the X triangle: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Now enter the measure of the Y triangle: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.printf("Triangle X area: %.4f%n",x.area);
        System.out.printf("Triangle y area: %.4f%n",y.area);

        sc.close();
    }

    public static void LargerTri(double a, double b) {
        double larger = (a > b) ? a : b;
        System.out.printf("The larger triangle is %.4f",larger);
    }
}
