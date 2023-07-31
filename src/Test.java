import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        lista.add("Teste");
        lista.add("Teste2");
        lista.add("Teste3");
        lista.add("Teste4");

        System.out.println(lista.stream().filter(x -> x.startsWith("J")).findFirst().orElse(null));
        System.out.println(lista);

        int x = 12;
        int y = 10;

        while(test(x,y)){
            x = sc.nextInt();
            System.out.println(test(x,y));
        }
        while(x != y){
            System.out.println("Teste");
        }


        sc.close();
    }
    public static boolean test(int x,int y){
        return x != y;
    }
}
