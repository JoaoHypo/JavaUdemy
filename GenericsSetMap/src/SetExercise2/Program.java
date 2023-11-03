package SetExercise2;

import SetExercise2.entities.Course;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course a = new Course("A");
        Course b = new Course("B");
        Course c = new Course("C");

        System.out.print("How many students for course A?");
        int many = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < many; i++ ){
            System.out.printf("%d#:",i + 1);
            a.addUser(sc.nextInt());
        }
        System.out.print("How many students for course B?");
        many = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < many ; i++ ){
            System.out.printf("%d#:",i + 1);
            b.addUser(sc.nextInt());
        }


        System.out.print("How many students for course C?");
        many = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < many ; i++ ){
            System.out.printf("%d#:",i + 1);
            c.addUser(sc.nextInt());
        }


        Set<Integer> intersection = new HashSet<>(a.getUsers());
        intersection.addAll(b.getUsers());
        intersection.addAll(c.getUsers());
        System.out.println("Total Students:" + intersection.size());

        for (Integer numb : intersection){
            System.out.println(numb);
        }

        System.out.println();

        for (Integer numb : a.getUsers()){
            System.out.println(numb);
        }

        sc.close();
    }
}
