package Set.application;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        System.out.println();

        System.out.println("Insertion order:\nTV\nTablet\nNotebook");
        System.out.println();

        System.out.println("Print order showing HashSet does not have an default organization:");
        for (String p : set) {
            System.out.println(p);
        }

    }
}
