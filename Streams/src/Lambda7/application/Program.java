package Lambda7.application;

import Lambda7.entitites.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))){
            System.out.print("Enter salary bound:");
            Double salaryBound = sc.nextDouble();
            sc.nextLine();

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line!= null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salaryBound)
                    .map(e -> e.getEmail())
                    .sorted((email1, email2) -> email1.compareTo(email2))
                    .toList();


            System.out.printf("Email of people whose salary is more than %.2f:%n%n",salaryBound);

            emails.forEach(System.out::println);

            System.out.println();

            System.out.print("Type a letter to filter salary by: ");
            char initialFilter = sc.nextLine().toUpperCase().charAt(0);

            Double initialSum = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == initialFilter)
                    .map(e -> e.getSalary())
                    .reduce(0.0,(a,b) -> a + b);

            System.out.printf("Sum of salary of people whose name starts with %s: %.2f",initialFilter,initialSum);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
