import java.util.Stack;

public class FindthenextGreaterelement {
    public static int findGreatest(Stack<Integer> stack) {
        if (stack.isEmpty()) return -1; // Edge case

        int maxElement = Integer.MIN_VALUE;
        Stack<Integer> tempStack = new Stack<>();

        // Traverse the stack and find the maximum
        while (!stack.isEmpty()) {
            int current = stack.pop();
            maxElement = Math.max(maxElement, current);
            tempStack.push(current);
        }

        // Restore the stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return maxElement;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        
        System.out.println("Greatest Element: " + findGreatest(stack)); // Output: 4
    }
    
}
