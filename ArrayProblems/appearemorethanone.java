import java.util.HashMap;

public class appearemorethanone {

 static void morethanNK(int a[], int n, int k) {
  int x = n / k;
  HashMap<Integer, Integer> y = new HashMap<>();
  for (int i = 0; i < n; i++) {
   if (!y.containsKey(a[i]))
    y.put(a[i], 1);
   else {
    int count = y.get(a[i]);
    y.put(a[i], count + 1);
   }
  }

 }

 public static void main(String[] args) {

 }
}
