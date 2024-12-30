// public class RotateMatrix {
//     public static void rotate180(int[][] matrix) {
//         int n = matrix.length;
//         for (int i = 0; i < n / 2; i++) {
//             for (int j = 0; j < n; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[n - i - 1][n - j - 1];
//                 matrix[n - i - 1][n - j - 1] = temp;
//             }
//         }
//         if (n % 2 != 0) {
//             for (int i = 0; i < n / 2; i++) {
//                 int temp = matrix[n / 2][i];
//                 matrix[n / 2][i] = matrix[n / 2][n - i - 1];
//                 matrix[n / 2][n - i - 1] = temp;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
//         rotate180(matrix);
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


public class RotateMatrix {

    public static void main(String[] args) {
        System.out.println("heloo world ");
    }
}