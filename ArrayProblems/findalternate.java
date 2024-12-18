import java.util.ArrayList;

public class findalternate {

    public static void alternateElement(int arr[]) { 
        ArrayList<Integer> arrayList =  new ArrayList<>(); 
        for (int i = 0; i < arr.length; i = i + 2) { 
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        alternateElement(arr);
    }
}


