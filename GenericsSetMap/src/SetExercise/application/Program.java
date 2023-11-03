package SetExercise.application;

import SetExercise.entitites.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type file path: ");
        //C:\Users\jguib\Desktop\JavaUdemy\GenericsSetMap\src\SetExercise\in.txt
        Set<LogEntry> set = new TreeSet<>(); //already sorted
        try(BufferedReader bf = new BufferedReader(new FileReader(sc.nextLine()))){
            String line = bf.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                if (set.add(new LogEntry(fields[0], Instant.parse(fields[1])))){}
                else{
                    for (LogEntry logEntry : set){
                        if (logEntry.getUsername().hashCode() == fields[0].hashCode()){
                            logEntry.addLoginTime(Instant.parse(fields[1]));
                        }
                    }
                }
                line = bf.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Users that logged in in the past days: " + set.size());
        System.out.println();

        for (LogEntry logEntry : set){
            System.out.println(logEntry);
            System.out.println();
        }
        sc.close();
    }
}
