package EstructureReview;
import java.util.Arrays;

public class teste {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Cloning the original array
        int[] clonedArray = originalArray; //comentado o clone .clone();

        // Modifying the original array
        originalArray[0] = 10;

        // Printing both arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Cloned Array: " + Arrays.toString(clonedArray));
    }
}
