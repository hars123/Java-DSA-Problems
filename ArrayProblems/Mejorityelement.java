// import java.util.HashMap;
// public class Mejorityelement {


//        static int majorityelement(int arr[]){
//         HashMap<Integer, Integer>hash = new HashMap<>();
//         int res = 0;
//         int mej = 0;
//         for(int n : arr){
//             hash.put(n, 1+hash.getOrDefault(n, 0));
//             res = n;
//             mej = hash.get(n);


//         }
//         return res;
//        }


//     public static void main(String[] args) {
//         int arr[] = {1,3,4,4,3,2,2,2,2,2};
//         System.out.println("Your element that appear maximum times : " + majorityelement(arr));
       
//     }
// }
import java.util.HashMap;
public class Mejorityelement {
    static int Mejorityelementingivenarray(int arr[]){
        HashMap<Integer,Integer>hashmap = new HashMap<>();
        int res = 0, mej = 0;
        for(int n : arr){
            hashmap.put(n, 1+hashmap.getOrDefault(n,0));
            res = n;
            mej = hashmap.get(n);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,23,4,5,6,6,7,8,9,9,0};
        System.out.println(Mejorityelementingivenarray(arr));
       

        }
        

    }

