package Set.application;

import java.util.HashSet;
import java.util.Set;
import Set.entities.Product;

public class Program {
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));
        //false since Product does not have hashcode equals implementation,
        // so the compiler compares the pointer, and prod is diff from the Notebook inside the set.

        //after hashcode equals implementation = True, since now the comparison is done by content
        // and not by memory pointer
    }
}
