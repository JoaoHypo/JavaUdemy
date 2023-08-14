package EstructureReview;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the N for the quadratic matrix: ");
        int n = sc.nextInt();
        sc.nextLine();

        //Creating matrix
        int [][] matrix = new int [n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("Type the term [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
                sc.nextLine();
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

        sc.close();
    }
}
