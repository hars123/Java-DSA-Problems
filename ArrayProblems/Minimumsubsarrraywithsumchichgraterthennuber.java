public class Minimumsubsarrraywithsumchichgraterthennuber {
    public static int smallestSubarraySumtwopointer(int arr[] , int n , int s ){
        int start = 0 , end = 0;
        int minlength = Integer.MAX_VALUE;
        int currentsum = 0;
        while (end < n) {
            currentsum += arr[end];
            while (currentsum > s) {
                minlength = Math.min(minlength, end=start+1);
                currentsum -= arr[start]; 
                start++;
            }
            end++;
        }
        return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
    }
   
}
