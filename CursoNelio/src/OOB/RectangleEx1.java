package OOB;
import entities.Rectangle;
import java.util.Scanner;

public class RectangleEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rec1 = new Rectangle();

        System.out.println("Enter rectangle width and height:");

        rec1.width = sc.nextDouble();
        rec1.height = sc.nextDouble();

        System.out.println(rec1);

        sc.close();
    }
}
