import java.util.HashSet;

public class findlongestconssicutivesubseqquences {
 static int Longconsseq(int a[]) {
  HashSet<Integer> s = new HashSet<Integer>();
  int ans = 0;
  for (int i = 0; i < a.length; i++)
   s.add(a[i]);
  for (int i = 0; i < a.length; i++) {
   if (!s.contains(a[i] - 1)) {
    int j = a[i];
    while (s.contains(j))
     j++;
    if (ans < j - a[i]) {
     ans = j - a[i];
    }
   }

  }
  return ans;

 }

 public static void main(String[] args) {

  int a[] = { 1, 9, 3, 10, 4, 20, 2 };
  System.out.println(Longconsseq(a));
 }

}