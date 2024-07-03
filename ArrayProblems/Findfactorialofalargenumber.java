/**
 * Findfactorialofalargenumber
 */
public class Findfactorialofalargenumber {

 static void fac(int n) {
  int res[] = new int[500];
  res[0] = 1;
  int res_size = 1;
  for (int i = 2; i <= n; i++)
   res_size = multiply(i, res, res_size);

  for (int i = res_size - 1; i >= 0; i--) {
   System.out.print(res[i]);

  }

 }

 static int multiply(int x, int res[], int res_size) {
  int carry = 0;
  for (int i = 0; i < res_size; i++) {
   int pro = res[i] * x + carry;
   res[i] = pro % 10;
   carry = pro / 10;
  }

  while (carry != 0) {
   res[res_size] = carry % 10;
   carry = carry / 10;
   res_size++;
  }

  return res_size;

 }

 public static void main(String[] args) {
  fac(5);

 }
}