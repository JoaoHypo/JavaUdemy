package Lambda2.application;

import java.util.ArrayList;
import java.util.List;
import Lambda2.entities.Product;
import Lambda2.util.ProductPredicate;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        //list.removeIf(p -> p.getPrice() >= min);
        //Predicate<Product> pred = p -> p.getPrice() >= min);
        list.removeIf(new ProductPredicate());


        for (Product p : list) {
            System.out.println(p);
        }
    }
}
