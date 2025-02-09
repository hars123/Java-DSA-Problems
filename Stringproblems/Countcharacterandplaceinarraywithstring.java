import javax.print.DocFlavor.STRING;

public class Countcharacterandplaceinarraywithstring {

static int compare(char chars[]){
    int n = chars.length;
    int idx = 0;
    for(int i = 0;i<n;i++){
        char ch = chars[i];
        int count = 0;

        while (i < n && chars[i] == ch) {
            count++;
            i++;
        }if(count == 1) {
            chars[idx] = ch;
            idx++;
        }else{
            chars[idx] = ch;
            for(char digit: Integer.toString(count).toCharArray()){
                chars[idx] = digit;

            }
        }
        i--;


    }
    return idx;

   }




   
}