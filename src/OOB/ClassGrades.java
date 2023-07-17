package OOB;

import entities.Student;

import java.util.Scanner;

public class ClassGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student S1 = new Student();

        S1.name = sc.nextLine();
        S1.grade1 = sc.nextDouble();
        sc.nextLine();
        S1.grade2 = sc.nextDouble();
        sc.nextLine();
        S1.grade3 = sc.nextDouble();
        sc.nextLine();

        System.out.println(S1);
        sc.close();
    }
}
