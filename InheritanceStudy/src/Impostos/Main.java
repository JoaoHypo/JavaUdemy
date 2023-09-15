package Impostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Digite o numero de contribuintes:  ");
        int numContribuintes = sc.nextInt();
        sc.nextLine();

        for (int i = 0 ; i < numContribuintes ; i++){
            System.out.printf("Dados do contribuinte #%d:%n", i+1);
            System.out.print("Pessoa Jurídica ou Física? (j/f) ");
            char tipoContribuinte = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Renda Anual: ");
            Double rendaAnual = sc.nextDouble();
            sc.nextLine();
            if (tipoContribuinte == 'j'){
                System.out.print("Número de funcionarios: ");
                int numFuncionarios = sc.nextInt();
                sc.nextLine();
                contribuintes.add(new PerssoaJuridica(name,rendaAnual,numFuncionarios));
            } else if (tipoContribuinte == 'f') {
                System.out.print("Gastos com Saude: ");
                Double gastosSaude = sc.nextDouble();
                sc.nextLine();
                contribuintes.add(new PessoaFisica(name,rendaAnual,gastosSaude));
            }
        }
        System.out.println("IMPOSTOS PAGOS:");
        Double total = 0.0;
        for (Contribuinte contribuinte : contribuintes){
            System.out.println(contribuinte.toString());
            total += contribuinte.imposto();
        }
        System.out.printf("IMPOSTOS TOTAIS: $ %.2f",total);
        sc.close();
    }
}
