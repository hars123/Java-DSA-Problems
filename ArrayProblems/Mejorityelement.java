import java.util.HashMap;
public class Mejorityelement {
    // static int Majorityelementingivenarray(int arr[]){
    //     HashMap<Integer, Integer>hash = new HashMap<>();
    //     int res = 0;
    //     int maj = 0;

    //     for(int n : arr){
    //         hash.put(n, 1 + hash.getOrDefault(n, 0));
    //         if(hash.get(n) > maj){
    //             res = n;
    //             maj = hash.get(n);
    //         }
    //     }

    //     return res;
    // }

     static int majorityelement(int arr[]){
        HashMap<Integer,Integer>hash = new HashMap<>();
        int res =0;
        int mej =0;

        for(int n: arr){
            hash.put(n, 1+hash.getOrDefault(n, 0));
            if(hash.get(n)> mej){
                res =n;
                mej = hash.get(n);

            }
        }
            return res;
     }



    public static void main(String[] args) {
        int arr[] = {1,3,4,4,3,2,2,2,2,2};
        System.out.println("Your element that appear maximum times : " + majorityelement(arr));
       
    }
}