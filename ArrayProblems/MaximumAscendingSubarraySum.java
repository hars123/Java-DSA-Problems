public class MaximumAscendingSubarraySum {

    static int MaximumAscendingSubarraySum(int arr[]){
        int maxsum = arr[0];
        int currentsum = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                currentsum += arr[i];
            }else{
                maxsum = Math.max(maxsum, currentsum);
                currentsum = arr[i];
            }
        }
        return Math.max(maxsum, currentsum);
    }
 public static void main(String[] args) {
    int arr[] = {10,20,30,5,10,50};
    System.out.println(MaximumAscendingSubarraySum(arr));   
 }
    
}