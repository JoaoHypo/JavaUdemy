import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("Teste");
        lista.add("Teste2");
        lista.add("Teste3");
        lista.add("Teste4");

        System.out.println(lista.stream().filter(x -> x.startsWith("J")).findFirst().orElse(null));
        System.out.println(lista);


    }
}
