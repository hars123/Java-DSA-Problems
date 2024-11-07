// public class Linearsearch {
//     public static void main(String[] args) {
//         int number = 2;
//         int flag = 0;
//         int arr[] = {1,2,3,4,5,6,7};
//         for(int i = 0;i<arr.length;i++){
//             if(number == arr[i]){
//                 flag = 1;
//                 break;
//             }
            
//         } 
//         if(flag == 1) System.out.println("Number is pesent");
//         else System.out.println("Not presnt");
//     }
    
// }

import java.util.Scanner;

public class Linearsearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow
            
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer your Target");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
      
        
    }


