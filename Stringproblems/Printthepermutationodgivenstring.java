// Print the all permutation of given string 

public class Printthepermutationodgivenstring {
    public static void printpermutation(String str, String current ){
        if(str.length() == 0){
            System.out.println(current);
            return;
        }
         

        for(int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            
            String remaining = str.substring(0, i) + str.substring(i+1);

            

            printpermutation(remaining, current + ch);

        }

    }
    public static void main(String[] args) {
        String str = "abc";  // Change this to test for different inputs
        System.out.println("All permutations of the string \"" + str + "\":");
        printpermutation(str, "");
    }
    
    
}

 



