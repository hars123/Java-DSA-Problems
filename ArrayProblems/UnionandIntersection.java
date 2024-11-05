import java.util.ArrayList;

public class UnionandIntersection {


    static void Union(int firstarray[], int secondarray[]){
        int leftpointer = 0, rightpointer = 0;
        ArrayList<Integer>Result = new ArrayList<>();
        while(leftpointer < firstarray.length ||  rightpointer < secondarray.length){


            // Skip Duplicate
            while (leftpointer > 0 && leftpointer<firstarray.length && firstarray[leftpointer] == firstarray[leftpointer-1]) {
                leftpointer++;    
            }

            while (rightpointer > 0 && rightpointer<secondarray.length && secondarray[rightpointer] == secondarray[rightpointer-1]) {
                rightpointer++;    
            }

            // one array exh

            if(leftpointer >= firstarray.length){
                Result.add(secondarray[rightpointer]);
                rightpointer++;
                continue;  // Yha se loop piche jayega bo na jaye tabhi yha pe continue daal rhe h 
            }

            if(rightpointer >= firstarray.length){
                Result.add(secondarray[leftpointer]);
                leftpointer++;
                continue; 
            }

            // Comparison Code

            if(firstarray[leftpointer] < secondarray[rightpointer]){
                Result.add(firstarray[leftpointer]);
                leftpointer++;
            }else if(firstarray[leftpointer] > secondarray[rightpointer]){
                Result.add(secondarray[rightpointer]);
                rightpointer++;

            }else{
                Result.add(firstarray[leftpointer]);
                rightpointer++;
                leftpointer++;

            }
        }
        System.out.println(Result);      
    }


    static void Intersection( int firstarray[], int secondarray[]){

        int leftpointer = 0, rightpointer = 0;
        ArrayList<Integer>Result = new ArrayList<>();
        while (leftpointer < firstarray.length && rightpointer < secondarray.length) {

            // Duplicate
            while ( leftpointer > 0 && leftpointer < firstarray.length && firstarray[rightpointer] == firstarray[rightpointer-1]) {
                leftpointer++;
                
            }

            while ( rightpointer > 0 && rightpointer < secondarray.length && secondarray[rightpointer] == secondarray[rightpointer-1]) {
                rightpointer++;
                
            }
            // One array exhausted
            if(leftpointer>0 || rightpointer > secondarray.length){
                break;
            } 

            // comparison

            if(firstarray[leftpointer] < secondarray[rightpointer]){
                leftpointer++;
            }else if (firstarray[leftpointer] > secondarray[rightpointer]){
                rightpointer++;
            }else{
                Result.add(secondarray[leftpointer]);
                leftpointer++;
                rightpointer++;

            }
            
        }

    }


    public static void main(String[] args) {
        int firstarray[] = {1,1,1,2,2,2,3,3,3};
        int secondarray[] = {3,3,3,4};

        System.out.print("Union of your firstarray and Second array :");
        Union(firstarray, secondarray);

    }
    
}
