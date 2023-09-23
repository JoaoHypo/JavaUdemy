package application;

import java.io.*;
import java.util.Scanner;

public class CsvSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CSV ITEM SUMMARY:");
        System.out.println();

        System.out.print("Type your .csv file path:\n--> ");
        String path = sc.nextLine();
        File file = new File(path);

        if (file.exists() && file.length() > 0) {

            String outPath = file.getParent()+"\\csvOut";
            boolean success = new File(outPath).mkdir();
            System.out.println("Folder csvOut created: " + success);

            //using try with resources to ensure they are closed withing the end of the context
            try (BufferedReader br = new BufferedReader(new FileReader(path));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(outPath+"\\summary.csv"))) {

                System.out.println("summary.csv created");
                System.out.println();

                String line = br.readLine();

                while (line != null) {
                    System.out.println(line);
                    String[] data = line.split(",");
                    bw.write(data[0]+",");
                    if(Integer.parseInt(data[2])>1){
                        bw.write(String.format("%.2f",Double.parseDouble(data[1]) * Double.parseDouble(data[2])));
                    }
                    else {
                        bw.write(data[1]);
                    }
                    bw.newLine();
                    line = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else {
            System.out.println("File dos not exist or is empty");
        }
        sc.close();
    }
}
