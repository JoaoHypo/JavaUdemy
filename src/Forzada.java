import java.util.Scanner;

public class Forzada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1,n,sum;
        sum = 0;
        n1 = sc.nextInt();
        int cont=0; //we can declare things out of the for, the only obligated is the condition
        for (;cont<n1;) { //comand;condition;action (cont++) == (cont += 1)
            cont++;
            n = sc.nextInt();
            sum += n;

        }
        System.out.printf("A soma é %d",sum);

        sc.close();
    }
}
