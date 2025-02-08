// What is a Median?
// The median is the value that separates a sorted list into two equal halves.
// If the combined number of elements is odd, the median is the middle element.
// If the combined number of elements is even, the median is the average of the two middle elements.


public class Mideanoftwosortedarray {
   
  public static int medianofequalsizeofarray(int arr[],  int arr2[]){
    int n = arr.length;
    int merged[] = new int[2*n];
    int i = 0, j = 0, k = 0;
    
    while (i<n && j< n) {
        if(arr[i] < arr2[j]) merged[k++] = arr[i++];
        else merged[k++] = arr2[j++];  
    }
    while (i<n) merged[k++] = arr[i++];
    while(j<n) merged[k++] = arr2[j++];
    return (merged[n-1] + merged[n]) / 2;
  }
    
}
