public class Fiindsubsequenceongivenstring {

    public static void printsubsequnce(String str , String current , int index){
        if(index == str.length()){
            System.out.println(current);
            return;

          

        }
        // Include the current character int the subsequence
        printsubsequnce(str, current + str.charAt(index), index + 1);
        // exclude the current character form the subsequence 
        printsubsequnce(str, current, index+1);
    }

    
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequence of the string " + str );
        printsubsequnce(str, "", 0);            
    }
}
