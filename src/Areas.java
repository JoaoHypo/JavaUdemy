import java.util.Scanner;
public class Areas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A,B,C,t,c,tp,q,r;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        t = A * C /2;
        c = Math.PI * Math.pow(C,2);
        tp = ((A + B)/2)*C;
        q = Math.pow(B,2);
        r = A * B;

        System.out.printf("TRIANGULO: %.3f%n",t);
        System.out.printf("CIRCULO: %.3f%n",c);
        System.out.printf("TRAPEZIO: %.3f%n",tp);
        System.out.printf("QUADRADO: %.3f%n",q);
        System.out.printf("RETANGULO: %.3f%n",r);
    }
}
