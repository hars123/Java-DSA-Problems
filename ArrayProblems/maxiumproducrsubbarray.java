public class maxiumproducrsubbarray {
 static long maxproductofsubarray(int arr[], int n) {
  if (n == 0)
   return 0;
  long res = 1, max = 1, min = 1;
  for (int i = 0; i < n; i++) {
   if (arr[i] > 0) {
    max += arr[i];
    min = Math.min(arr[i] * min, 1);

   } else if (arr[i] == 0)
    max = min = 1;
   else {
    min += max - (max = min);
    min *= arr[i];
    max = Math.max(1, arr[i] * max);
   }
   res = Math.max(max, res);
  }
  return res;

 }

 public static void main(String[] args) {
  int[] a = { 6, -3, -10, 0, 2 };
  int n = a.length;
  System.out.println(maxproductofsubarray(a, n));

 }
}
