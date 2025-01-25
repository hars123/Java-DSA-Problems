import java.util.Arrays;
import java.util.Random;
public class ChocolateDistribution {
  

    public static int findMinDifferenceRandomized(int[] arr, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m > n) {
            return -1; // Not enough packets for students
        }
    
        Random random = new Random();
        int trials = 100; // Number of random trials
        int minDifference = Integer.MAX_VALUE;
    
        for (int t = 0; t < trials; t++) {
            // Randomly pick M packets
            int[] selected = new int[m];
            for (int i = 0; i < m; i++) {
                selected[i] = arr[random.nextInt(n)];
            }
    
            // Find difference for this selection
            int max = selected[0], min = selected[0];
            for (int val : selected) {
                max = Math.max(max, val);
                min = Math.min(min, val);
            }
    
            minDifference = Math.min(minDifference, max - min);
        }
    
        return minDifference;
    }
    
    // Main method to test the function
    public static void main(String[] args) {
        int[] chocolates = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42}; // Chocolate packets
        int students = 7; // Number of students

        // Find the minimum difference
        int result = findMinDifferenceRandomized(chocolates, chocolates.length, students);

        // Output the result
        if (result == -1) {
            System.out.println("Distribution not possible.");
        } else {
            System.out.println("The minimum difference is: " + result);
        }
    }
}
