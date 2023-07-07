import java.util.Scanner;

public class Forzada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1,n,sum;
        sum = 0;
        n1 = sc.nextInt();

        for (int cont=0;cont<n1;cont++) { //comand;condition;action (cont++) == (cont += 1)

            n = sc.nextInt();
            sum += n;

        }
        System.out.printf("A soma é %d",sum);

        sc.close();
    }
}
