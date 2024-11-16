public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int largest = arr[0], secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {    
            // First loop to find the largest element
            if (num > largest) {
                largest = num;
            }
        }

       
        for (int num : arr) {    // Second loop to find the second largest element
            if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        // Output 
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
