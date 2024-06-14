/**
 * findcommonelementinasortedarrays
 */
public class findcommonelementinasortedarrays {
 static void findcommonelement(int a[], int b[], int c[]) {
  int i = 0, j = 0, k = 0;

  while (i < a.length && j < b.length && k < c.length) {
   if (a[i] == b[j] && b[j] == c[k]) {
    System.out.println("  " + a[i]);
    i++;
    j++;
    k++;
   } else if (a[i] < b[j]) {
    i++;
   } else if (b[j] < c[k]) {
    j++;
   } else {
    k++;
   }
  }

 }

 public static void main(String[] args) {
  int arr1[] = { 1, 5, 10, 20, 40, 80 };
  int arr2[] = { 6, 7, 20, 80, 100 };
  int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
  findcommonelement(arr1, arr2, arr3);

 }

}