import java.util.HashSet;

public class Duplicatecharacter {

    public static void main(String[] args) {
        // String A = "HARSHIT";
        // HashSet seen = new HashSet<>();
        // for(int i = 0; i<A.length();i++){
        //    if(!seen.add(A.charAt(i))){
        //     System.out.println(A.charAt(i));
        //    }
        // }


        // String s = "HARSHIT";
        // HashSet seen = new HashSet<>();
        // for(int i = 0;i<s.length();i++){
        //     if(!seen.add(s.charAt(i))){
        //         System.out.println(s.charAt(i));
        //     }
        // }


        String s = "HARSHIT";
        HashSet seen = new HashSet<>();

        for(int i = 0; i<s.length();i++){
           if(!seen.add(s.charAt(i))){
                System.out.println(s.charAt(i));

           }
        }
        
        
    }
}
