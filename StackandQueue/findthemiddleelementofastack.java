import java.util.Stack;

public class findthemiddleelementofastack {

    public static int Findmiddelelement( Stack<Integer> stack, int size ){
        if(stack.isEmpty() || size == 0) return -1;  //Agar stack empty hai ya zero hai  to return -1

        return findMiddleHelper(stack, size, 0);

    }

    private static int findMiddleHelper(Stack<Integer>stack , int size , int count){
        if(count == size/2){
            return stack.peek(); // middle element found
        }

        int temp = stack.pop();
        int middle = findMiddleHelper(stack, size, count+1);
        stack.push(temp);

        return middle;

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int middeeleemnt = Findmiddelelement(stack, stack.size());
        System.out.println(middeeleemnt);


        
    }
    
}
