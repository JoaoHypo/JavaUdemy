package EstructureReview;

import java.util.Scanner; //importando o imputador

public class Bhaskara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //declarando o sc

        double a,b,c,delta,x1,x2;//t

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        //t = (Math.pow(b, 2)); test only
        //System.out.println(t);
        delta = Math.sqrt((Math.pow(b,2))-(4*a*c));

        if (!Double.isNaN(delta)){
            x1 = -b + delta / (2 * a);
            x2 = -b - delta / (2 * a);

            System.out.printf("a = %.2f %n", a);
            System.out.printf("b = %.2f %n", b);
            System.out.printf("c = %.2f %n", c);
            System.out.printf("Delta = %.2f %n", delta);
            System.out.printf("X1 = %.2f %n", x1);
            System.out.printf("X2 = %.2f %n", x2);
            }
        else {
            System.out.println("Delta da raiz negativo e logo incaculável com números reais");
        }
        sc.close(); //fechando o inputador , podemos também tentar:
        // try (Scanner sc = new Scanner(System.in)) {
        // Use the scanner to read input
        // ...
    } // The scanner will be closed automatically at the end of the block
}
