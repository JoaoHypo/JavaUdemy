package Set.application;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        System.out.println();

        System.out.println("Insertion order:\nTv\nTablet\nNotebook");
        System.out.println();

        System.out.println("Print order showing that TreeSet by default sort the content:");
        for (String p : set) {
            System.out.println(p);
        }

    }
}
