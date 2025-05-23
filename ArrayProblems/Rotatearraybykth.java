public class Rotatearraybykth {
     
    public static void reverse(int nums[], int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;  
        }
    }
    public  static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0 , nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums,k, nums.length-1);
    }

    public static void printarray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        rotate(arr, 2);
        printarray(arr );

    
    }
    
}