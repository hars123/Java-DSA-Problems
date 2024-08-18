public class substringornot {

    public static boolean issubstringornot(String s, String t){
        int n = s.length();
        int m = t.length();
        int i = 0;

        for(int j = 1; j<m ;j++){
            if(n == i) return true;

            if(s.charAt(i) == t.charAt(i)){
                i++;

            }


        }
        return n == i;


        
      

    }

    public static void main(String[] args) {
        System.out.println(issubstringornot("yty", "abcd"));
        
    }
    
}
