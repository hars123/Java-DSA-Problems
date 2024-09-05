public class Subswquanceornot {

    public static boolean isSubseqornot(String t , String s){

        int i = 0, j = 0;
        int m = s.length();
        int n = t.length();

        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();

        if(m<1) return true;

        while (i<n) {
            if(tt[i] == ss[j]){
                j++;
            }
            i++;
            if(j == m) return true;

            
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(isSubseqornot("abcdefghijkl", "xxxx"));
        
    }
    
}
