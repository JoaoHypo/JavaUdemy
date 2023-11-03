package Set.application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetSample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        System.out.println();

        System.out.println("Insertion order:\nTv\nTablet\nNotebook");
        System.out.println();

        System.out.println("Print order showing that LinkedHashSet by default keeps insertion order:");
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Removing Tablet:");
        set.remove("Tablet");
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Removing length >= 3:");
        set.removeIf(x -> x.length() >= 3);
        for (String p : set) {
            System.out.println(p);
        }

    }
}
