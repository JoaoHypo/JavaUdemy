package EmployeeSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Employees are you going to register? ");
        Integer numberOfEmployees = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for(int i=0 ; i < numberOfEmployees ; i++){
            System.out.printf("Employee #%d data%n",i+1);
            System.out.print("Enter Employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee work hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee payment value per hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();

            System.out.println("Is this a Regular(1) Employee  or an Outsourced(2) Employee? ");
            System.out.println("Regular type 1\nOutsourced type 2");
            Integer selection = sc.nextInt();
            sc.nextLine();

            if (selection == 1){
                Employee employee = new Employee(name,hours,valuePerHour);
                employees.add(employee);
                System.out.println("Regular Employee registered successfully!\n");
            }
            if (selection == 2){
                System.out.print("Enter Employee addtional charge: ");
                Double additionalCharge = sc.nextDouble();
                sc.nextLine();
                OutsourcedEmployee employee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                employees.add(employee);
                System.out.println("Outsourced Employee registered successfully!\n");
            }
        }
        System.out.println();
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
        sc.close();
    }
}