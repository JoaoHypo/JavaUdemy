package EstructureReview;

import java.util.Scanner;

public class WhileZada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x,sum;

        x = sc.nextInt();
        sum = 0;

        while (x!=0){
            sum += x;
            x = sc.nextInt();
        }
        System.out.printf("Soma é %d",sum);
        sc.close();
    }
}
