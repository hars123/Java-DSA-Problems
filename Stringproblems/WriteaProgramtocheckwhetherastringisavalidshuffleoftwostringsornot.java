import java.lang.reflect.Array;
import java.util.Arrays;
import javax.print.DocFlavor.STRING;


public class WriteaProgramtocheckwhetherastringisavalidshuffleoftwostringsornot {
    public static boolean checklength(String first, String second, String result){
        if(first.length() + second.length() != result.length()){
            return false;
        }else{
            return true;
        }
    }
    static String sortString(String str)
    {
        char [] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);
        return str;
    }
    static boolean shuffel(String first, String second, String result)
    {
        first = sortString(first);


        
        second = sortString(second);
        result = sortString(result);
        int i = 0, j = 0, k = 0;

        while (k != result.length()) {
            if(i < first.length() && first.charAt(i) == result.charAt(k))
            {
                i++;
            }else if(j<second.length() && second.charAt(j)== result.charAt(k)){
                j++;
            }else{
                return false;
                
            }
            k++;          
        }
        if(i <first.length() || j<second.length()) return false;
        return true;
    }
    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String results[] = {"1XY2","Y1X2","Y21XX"};

        for(String result : results){
            if(checklength(first, second, result) == true && shuffel(first, second, result) == true){
                System.out.println(result +" is a valid shuffel of "+ first + " and " + second);
            }else{
                System.out.println(result + " is not a valid shuffel");
            }
        }       
    }   
}