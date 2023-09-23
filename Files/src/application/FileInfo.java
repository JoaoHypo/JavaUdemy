package application;

import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        File path = new File(sc.nextLine());

        System.out.println("getName: "+path.getName());
        System.out.println("getParent: "+path.getParent());
        System.out.println("getPath: "+path.getPath());

        sc.close();
    }
}