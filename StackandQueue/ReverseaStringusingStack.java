import java.util.Stack;

public class ReverseaStringusingStack {
    public static String ReversedString(String str){
        Stack<Character>stack = new Stack<>();

        // PUSH all the character
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }

        StringBuilder reveresed = new StringBuilder();
        while (!stack.isEmpty()) {
            reveresed.append(stack.pop());
            
        }
        return reveresed.toString();
    }


    public static void main(String[] args) {
        String input = "Hello Harshit";
        String reversed = ReversedString(input);
        System.out.println("Reversed String: " + reversed);
        
    }
    
}
