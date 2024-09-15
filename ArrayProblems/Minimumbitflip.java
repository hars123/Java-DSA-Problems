/**
 * Minimumbitflip
 */
public class Minimumbitflip {
    static int minimumbitflip(int start, int goal){
        int ans = 0, xor = start ^ goal;
        while (xor != 0) {
            ans += xor&1;   
            xor>>=1;         
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(minimumbitflip(10, 7));
        

    }
}   