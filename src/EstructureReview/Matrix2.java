package EstructureReview;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the number of M lines: ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.print("Type the number of N columns: ");
        int n = sc.nextInt();
        sc.nextLine();


        //Creating matrix
        int [][] matrix = new int [m][n];

        //using len to access the vectors
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("Type the term [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        // Printing the matrix
        for (int[] ints : matrix) {
            System.out.print("| ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("Type a number to search into the matrix: ");
        int num = sc.nextInt();
        sc.nextLine();

        //For to print the searched number
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j]==num){
                    System.out.println();
                    count++;
                    System.out.printf("Number %dst occurrence.%n",count);
                    System.out.printf("Position: %d,%d:%n",i,j);
                    if (j-1 >= 0){
                        System.out.printf("Left: %d%n",matrix[i][j-1]);
                    }
                    if (j+1 <= n-1){
                        System.out.printf("Right: %d%n",matrix[i][j+1]);
                    }
                    if (i-1 >= 0){
                        System.out.printf("Up: %d%n",matrix[i-1][j]);
                    }
                    if (i+1 <= m-1){
                        System.out.printf("Down: %d%n",matrix[i+1][j]);
                    }

                }
            }
        }
        System.out.println();
        if (count == 0){
            System.out.println("Number not found in the Matrix.");
        }
        sc.close();
    }
}
