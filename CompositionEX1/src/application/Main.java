package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter; //static /util
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name,level,baseSalary,department);

        System.out.print("How many contracts to this worker? ");
        int conNum = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < conNum; i++){
            System.out.printf("Enter contract #%d data:%n",i+1);

            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(),fmt);

            System.out.print("Value per Hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();

            System.out.print("Duration: ");
            Integer hours = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(date, valuePerHour, hours);

            worker.addContract(contract);
        }

        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
        String interval = sc.nextLine();
        LocalDate date = LocalDate.parse("10/"+interval,fmt);

        System.out.println(worker); //using toString by default

        System.out.printf("Income for %s: %.2f",interval,worker.income(date));


        sc.close();
    }
}