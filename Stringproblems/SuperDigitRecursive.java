import java.util.Scanner;

public class SuperDigitRecursive {

    
    public static int superDigit(long n) {
        if (n < 10) {
            return (int) n;
        }

        
        long sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;       
        }

        
        return superDigit(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long n = scanner.nextLong();

      
        int result = superDigit(n);
        System.out.println("The super digit is: " + result);

        scanner.close();
    }
}
