public class RearrangeAlternatingnegativepositive {

 static void swap(int arr[], int i, int j) {
  int c = arr[i];
  arr[i] = arr[j];
  arr[j] = c;
 }

 static void rearrangearray(int arr[], int n) {
  int i = 0;
  int j = n - 1;
  // Shift all negative elements to the end

  while (i < j) {
   while (j <= n - 1 && arr[i] > 0)
    i += 1;
   while (j >= 0 && arr[j] < 0)
    j -= 1;
   if (i < j)
    swap(arr, i, j);
  }
  if (i == 0 || i == n)
   return;
  int k = 0;
  while (k < n && i < n) {
   swap(arr, k, i);
   i = i + 1;
   k = k + 2;

  }

 }

 public static void main(String[] args) {
  int arr[] = { -11, -1, -2, 2, 3, 3, -33, 33 };
  int n = arr.length;
  rearrangearray(arr, n);
  for (int i = 0; i < arr.length; i++) {
   System.out.print(arr[i] + " ");
   
  }

 }

}
