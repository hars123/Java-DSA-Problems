import java.util.HashSet;

public class Firstandlastcharacterswapproblemleetcodeinjavasolution {
    static boolean solutionofproblemlastandfirstchracterofarray(String s1, String s2){
        
        int count = 0;
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(int i = 0; i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 != ch2){
                count++;
                set1.add(ch1);
                set2.add(ch2);


            }
            if(count > 2) return false;

        }
        return (count == 2 && set1.equals(set2)) || count == 0;
    }

    
}