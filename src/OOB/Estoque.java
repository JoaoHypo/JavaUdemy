package OOB;

import entities.Produto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto x = new Produto();

        System.out.println("Digite o nome do produto:");
        x.name = sc.nextLine();

        System.out.println("Digite o preço da unidade:");
        x.price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a quantidade do estoque:");
        x.quantity = sc.nextInt();
        sc.nextLine();

        x.returnData();

        System.out.println("Digite quantos produtos vai adicionar:");
        x.addProducts(sc.nextInt());
        sc.nextLine();
        x.returnData();

        System.out.println("Digite quantos produtos vai remover:");
        x.removeProducts(sc.nextInt());
        sc.nextLine();
        x.returnData();

        sc.close();
    }
}
