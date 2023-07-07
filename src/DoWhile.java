import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c,f; //Overall melhor declarar fora, melhora legibilidade e evita erros
                    //Só claro cuidar os cases em que alguma variável pode morrer no escopo de loops
                    //
        String sn;

        do {
            System.out.println("Digite a temperatura em Celcius: ");
            c = sc.nextDouble();
            sc.nextLine();
            f = ((9*c)/5) + 32;
            System.out.printf("Equivalente em Fahrenheit %.2f%n",f);
            System.out.println("Deseja repetir (s/n)? ");
            sn = sc.nextLine();

        }while (sn.equals("s"));
        System.out.print("Finalizando...");
        sc.close();
    }
}
