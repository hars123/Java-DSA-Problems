import java.util.HashSet;

public class Duplicatecharacter {

    public static void main(String[] args) {
     


        // String s = "HARSHIT";
        // HashSet seen = new HashSet<>();

        // for(int i = 0; i<s.length();i++){
        //    if(!seen.add(s.charAt(i))){
        //         System.out.println(s.charAt(i));

        //    }
        // }

        String s = "HarsHit";
        HashSet seen = new HashSet<>();

        for(int i = 0;i<s.length();i++){
            if(!seen.add(s.charAt(i)))
            System.out.println(s.charAt(i));
        }
        
        
    }
}
// Solved problem