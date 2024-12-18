import java.util.*;

public class AlternateRemoval {

    public static int findLastElement(int[] arr) {
       
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        boolean removeMax = true;

        while (list.size() > 1) {
            if (removeMax) {   
                int maxElement = Collections.max(list);
                list.remove((Integer) maxElement);
            } else {
                int minElement = Collections.min(list);
                list.remove((Integer) minElement);
            }     
            removeMax = !removeMax;
        }
        return list.get(0);
    }
    

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 2, 8, 6};
        int result = findLastElement(arr);
        System.out.println("The last remaining element is: " + result);
    }
}
