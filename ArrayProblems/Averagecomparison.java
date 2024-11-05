import java.util.Scanner;

public class Averagecomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your test cases:");
        int testcases = sc.nextInt();
       
        for (int i = 0; i < testcases; i++){
        
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            System.out.println("Your result:");

            // Check if (A + B) is greater than (2 * C)
            if(A + B > 2 * C) System.out.println("Yes");
            else System.out.println("No");


        }
        
    }
    
}


