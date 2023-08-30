package OOB;

import java.util.Scanner;

public class ProblemPreOOB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1,x2,x3, y1,y2,y3,xa,ya;
        System.out.println("Enter the measure of the X triangle: ");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        System.out.println("Now enter the measure of the Y triangle: ");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();

        xa = TriA(x1,x2,x3);
        ya = TriA(y1,y2,y3);

        System.out.printf("Triangle X area: %.4f%n",xa);
        System.out.printf("Triangle y area: %.4f%n",ya);

        LargerTri(xa,ya);

        sc.close();
    }
    public static double TriA(double a,double b,double c){
        double p =  (a + b + c) /2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c)); //could just return the expression
        return area;
    }

    public static void LargerTri(double a, double b) {
        double larger = (a > b) ? a : b;
        System.out.printf("The larger triangle is %.4f",larger);
    }
}
