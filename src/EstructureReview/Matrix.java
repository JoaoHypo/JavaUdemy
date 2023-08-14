package EstructureReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the N for the quadratic matrix: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> diagonal = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        //Creating matrix
        int [][] matrix = new int [n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("Type the term [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
                sc.nextLine();

                if (matrix[i][j] < 0) {
                    negative.add(matrix[i][j]);
                }
                if (i == j){
                    diagonal.add(matrix[i][j]);
                }
            }
        }

        for (int i = 0; i < n; i++){
            System.out.print("| ");
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.println("Diagonal: ");
        System.out.print("[");
        for (int num : diagonal){
            System.out.printf(" %d",num);
        }
        System.out.print(" ]\n");

        System.out.print("Negative Numbers: ");
        for (int num : negative){
            System.out.printf("%d, ",num);
        }

        sc.close();
    }
}
