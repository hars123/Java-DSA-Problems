/**
 * WriteaCodetocheckwhetheronestringisarotationanother
 */
public class WriteaCodetocheckwhetheronestringisarotationanother {
    public static boolean rotateString(String s, String goal){
        
        String whole = s+s;
        if(s.length() != goal.length()) return false;
        if(whole.indexOf(goal) == -1) return false;
        else return true;

    }

    public static void main(String[] args) {
        System.out.println(rotateString("adcde", "cdeab"));        
    }
} 