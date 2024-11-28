import java.util.HashMap;
public class findallpairssumequaltothenumber {
 static int getpairsCount(int arr[], int sum) {
  int n = arr.length;
  HashMap<Integer, Integer> hm = new HashMap<>();
  for (int i = 0; i < n; i++) {
   if (!hm.containsKey(arr[i]))
    hm.put(arr[i], 0);
   hm.put(arr[i], hm.get(arr[i]) + 1);
  }
  int twicecount = 0;
  for (int i = 0; i < n; i++) {
   if (hm.get(sum - arr[i]) != null)
    twicecount += hm.get(sum - arr[i]);
   if ((sum - arr[i]) == arr[i])
    twicecount--;
  }
  return twicecount / 2;
 }

 public static void main(String[] args) {
  int arr[] = { 3, 5, 7, 1 };
  int sum = 8;
  System.out.println(getpairsCount(arr, sum));
 }
}