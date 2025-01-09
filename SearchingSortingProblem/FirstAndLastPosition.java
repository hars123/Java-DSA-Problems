// public class Firstandlastpositioningivenarrayfromsrotedarray {
//     public static int[] FindFirstandLast(int nums[] , int target){
//         int result[] = {-1,-1};
//         result[0] = binarySearch(nums,target, true);

//         if(result[0] != -1){
//             result[1] = binarySearch(nums,target,false);
//         }
//         return result;
//     }

//     private static int binarySearch(int nums[] , int target, boolean findfirst){
//         int start = 0 , end = nums.length-1;
//         int position = -1;

//         while (start<= end) {
//             int mid = start + (start+end)/2;

//             if(nums[mid] == target){
//                 position = mid;
//                 if(findfirst){
//                     end = mid-1;
//                 }else{
//                     start = mid + 1;
//                 }
//             }else if(nums[mid] < target){
//                 start = mid + 1;

//             }else{
//                 end = mid-1;
//             }
            
//         }
//          return position;

//     }

//     public static void main(String[] args) {
//         int[] nums = {5, 7, 7, 8, 8, 10};
//         int target = 8;
        
//         int[] result = FindFirstandLast(nums, target);
//         System.out.println("First and Last Positions: " + Arrays.toString(result));
        
        
//     }
// }

import java.util.Arrays;

public class FirstAndLastPosition {
    public static int[] findFirstAndLast(int[] nums, int target) {
        int[] result = {-1, -1}; // Default result if target is not found
        
        // Find the first occurrence
        result[0] = binarySearch(nums, target, true);
        
        // If the first occurrence is -1, no need to search for the last
        if (result[0] != -1) {
            result[1] = binarySearch(nums, target, false);
        }
        
        return result;
    }

    private static int binarySearch(int[] nums, int target, boolean findFirst) {
        int start = 0, end = nums.length - 1;
        int position = -1; // To store the position of the target
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                position = mid;
                if (findFirst) {
                    end = mid - 1; // Move left to find the first occurrence
                } else {
                    start = mid + 1; // Move right to find the last occurrence
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return position;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int[] result = findFirstAndLast(nums, target);
        System.out.println("First and Last Positions: " + Arrays.toString(result));
    }
}
