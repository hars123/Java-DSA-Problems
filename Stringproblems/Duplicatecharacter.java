import java.util.HashSet;

public class Duplicatecharacter {

    public static void main(String[] args) {        
          String s = "HarsHit";
          HashSet structure = new HashSet<>();
         for (int i = 0; i < s.length(); i++) {
          if(!structure.add(s.charAt(i))){
            System.out.println(s.charAt(i));
          }         
         }
    }  
}

// Solved problem