/**
 * Validpalindromeornot
 */
public class Validpalindromeornot {
    public static  boolean Palindrome(String s){

        if(s.isEmpty()){
            return false;
        }
        int start = 0, last = s.length()-1;
        while (start<= last) {
            char currfirst = s.charAt(start);
            char currlast = s.charAt(last);

            if(!Character.isLetter(currfirst)){
                start++;
            }else if(!Character.isLetter(currlast)){
                last--;
            }else{
                if(Character.toLowerCase(currfirst) != Character.toLowerCase(currlast)){
                    return false;
                }
                start++;
                last--;
            }
         
        }
        return true;


    }

    
    public static void main(String[] args) {

       System.out.println(Palindrome("amanaplanacanalpanama"));
        
    }
}