package MapExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> voting = new LinkedHashMap<>();
        System.out.print("Enter file full path: ");
        //C:\Users\jguib\Desktop\JavaUdemy\GenericsSetMap\src\MapExercise\in.txt
        try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                if (voting.containsKey(fields[0])){
                    voting.put(fields[0],voting.get(fields[0]) + Integer.parseInt(fields[1]));
                }
                else{
                    voting.put(fields[0],Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            for (String key : voting.keySet()){
                System.out.printf("%s: %d%n",key,voting.get(key));
            }
        }

        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
