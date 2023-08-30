package EstructureReview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {

        // <Integer> depois de array list é opicional nas versoões atuais de java
        List<String> list = new ArrayList<String>();

        //listas não aceitam tipos primitivos
        //utilizar wrapper classes para esses casos

        list.add("Hypo");
        list.add("Lol");
        list.add("Bru");
        list.add(0,"Primeiro");
        list.add("Hypo");
        list.add("HORUS");

        for (String i:list){
            System.out.println(i);
        }
        // remove o primeiro encontro
        list.remove("Hypo"); //remove comparando o valor
        list.remove(0);

        // list.removeIf(x -> x.charAt(0) == "H"); pra lembrar o erro, '' é char, "" string
        list.removeIf(x -> x.charAt(0) == 'H');


        System.out.println(list.size());
        System.out.println("----------------------------------------");

        for (String i:list){
            System.out.println(i);
        }
        System.out.println("Index of Bru: " + list.indexOf("Bru"));
        System.out.println("Index of Hypo: " + list.indexOf("Hypo"));

        System.out.println("----------------------------------------");

        list.add("Hypo");
        list.add("Lol");
        list.add("Bru");
        list.add(0,"Primeiro");
        list.add("Hypo");
        list.add("HORUS");

        for (String i:list){
            System.out.println(i);
        }

        System.out.println("----------------------------------------");
        //o stream não é uma list, então após filtrar precisaamos aplicar o método toList(), java 16+
        List<String> reuslt = list.stream().filter(x -> x.charAt(0) == 'H').toList();
        //List<String> reuslt = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());
        //O método Collectors.toList() é um coletor fornecido pelo pacote java.util.stream.Collectors que
        // realiza a tarefa de coletar os elementos filtrados em uma lista.
        //contexto java 8 ou menos.

        for (String i:reuslt){
            System.out.println(i);
        }
        System.out.println("----------------------------------------");
        System.out.println("Primeiro elemento com algum predicado");
        String name = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
        System.out.println(name);
        String name2 = list.stream().filter(x -> x.charAt(0) == 'y').findFirst().orElse(null);
        System.out.println(name2);

        System.out.println("----------------------------------------");
        System.out.println(list);
        System.out.println(reuslt);
    }
}
