// Print the all permutation of given string 

public class Printthepermutationodgivenstring {

    public static void printpermutation(String str, String current ){
        if(str.length() == 0){
            System.out.println(current);
            return;
        }
        // Loop through all the chracter of the string 

        for(int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            // Extract the character at index i
            String remaining = str.substring(0, i) + str.substring(i+1);

            // Recurse with the current character added to the result

            printpermutation(remaining, current + ch);

        }

    }
    public static void main(String[] args) {
        String str = "abc";  // Change this to test for different inputs
        System.out.println("All permutations of the string \"" + str + "\":");
        printpermutation(str, "");
    }
    
}
