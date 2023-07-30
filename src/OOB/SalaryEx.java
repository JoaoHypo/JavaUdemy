package OOB;

import entities.Employee2;

import java.util.Scanner;

public class SalaryEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee2 E1 = new Employee2();

        System.out.print("Name:");
        E1.name = sc.nextLine();

        System.out.print("Gross Salary:");
        E1.grossSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Tax:");
        E1.tax = sc.nextDouble();
        sc.nextLine();

        System.out.println("Employee: "+E1);

        System.out.print("Which percentage to increase salary:");
        E1.increaseSalary(sc.nextDouble());
        sc.nextLine();

        System.out.println("Updated data: "+E1);



        sc.close();
    }
}
