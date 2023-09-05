package application;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Department department = new Department();

        System.out.print("Enter department's name: ");
        department.setName(sc.nextLine());

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Name: ");
        Double baseSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name,level,baseSalary,department);

        System.out.print("How many contracts to this worker? ");
        int conNum = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < conNum; i++){
            System.out.printf("Enter contract #%d data:%n",i);

            System.out.print("Date (DD/MM/YYYY): ");
            Date date = Date.valueOf(sc.nextLine()); //todo:fix

            System.out.print("Value per Hour: ");
            Double hour = sc.nextDouble();
            sc.nextLine();

            System.out.println("Duration: ");
            Integer duration = sc.nextInt();
            sc.nextLine();

        }

        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
        Date date = Date.valueOf(sc.nextLine()); //todo:fix

        System.out.println();//toString from income? prob






        sc.close();
    }
}