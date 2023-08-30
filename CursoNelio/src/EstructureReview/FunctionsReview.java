package EstructureReview;

import java.util.Scanner;

public class FunctionsReview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);
        showResult(higher);

        sc.close();
    }
    //  Abrindo função max
    public static int max(int x,int y, int z) {
        int aux;

        if (x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }else aux = z;

        return aux;
    }
    public static void showResult(int x) { //void is when u dont have a return into the method
        System.out.printf("The higher value is %d",x);
    }
}
