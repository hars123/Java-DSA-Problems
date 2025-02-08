public class Minimumnumberofoperationtomakeanarraypalindrome {
    public static int minOperationTOmakeanarrayPalindrome(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int operations = 0;

        while (left < right) {
            if(arr[left] == arr[right]){
                left++;
                right--;


            }else if(arr[left] < arr[right]){
                //Merge adjacent element 

                arr[left + 1] += arr[left];
                left++;
                operations++;

            }else{
                //Merge arr[right] with arr[right - 1]
                arr[right -1] += arr[right];
                right--;
                operations++;
            }
            
        }
        return operations;

    }
    
}
