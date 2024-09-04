
public class Reverseastringwords {
    public static String Reversestring(String s){
        String words[] = s.trim().split("\\s+");
        StringBuilder ans  = new StringBuilder();

        for(int j = words.length-1;j>=0;j--){
            ans.append(words[j]);
            if(j != 0) ans.append(" ");

            
        }
        return ans.toString();


    }

    public static void main(String[] args) {
        System.out.println(Reversestring("hyy whatsapp"));
        
    }
}