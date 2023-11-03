package SetExercise.application;

import SetExercise.entitites.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type file path: ");
        //C:\Users\jguib\Desktop\JavaUdemy\GenericsSetMap\src\SetExercise\in.txt
        Set<User> set = new TreeSet<>(); //already sorted
        try(BufferedReader bf = new BufferedReader(new FileReader(sc.nextLine()))){
            String line = bf.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                User user = new User(fields[0], Instant.parse(fields[1]));
                set.add(user);
                line = bf.readLine();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Users that logged in in the past days: " + set.size());
        for (User user : set){
            System.out.println(user.getUsername());
        }
        sc.close();
    }
}
