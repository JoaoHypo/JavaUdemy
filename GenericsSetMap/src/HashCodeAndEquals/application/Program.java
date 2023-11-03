package HashCodeAndEquals.application;

import HashCodeAndEquals.entities.Client;

public class Program {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client c1 = new Client("Maria","teste1@gmail.com");
        Client c2 = new Client("Maria","teste1@gmail.com");
        Client c3 = new Client("José","teste1@gmail.com");
        Client c4 = new Client("Maria","teste234@gmail.com");

        System.out.println();
        System.out.println("HashCodes:");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

        System.out.println();
        System.out.println("Equals:");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        System.out.println(c3.equals(c4));

        System.out.println();
        //memory reference good to remember:
        System.out.println("Object memory comparison c1 == c2 (are equal):");
        System.out.println(c1 == c2);

        System.out.println();
        //String pool demonstration
        System.out.println("String pool demonstration:");
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test"); //Forcing String instance out of String pool
        String s4 = new String("Test");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s4);
    }
}
