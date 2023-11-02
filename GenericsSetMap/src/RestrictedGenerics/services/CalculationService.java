package RestrictedGenerics.services;

import java.util.List;

public class CalculationService {

    //confusing - T is comparable to itself type or any super class above T that has comparable implemented
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}