public class Maximumsumsubarray {
    static int maxsubarraysum(int arr[]){
        int maxsofar = Integer.MIN_VALUE;
        int currentmax = 0;

        for(int num : arr){
            currentmax += num;
            maxsofar = Math.max(maxsofar, currentmax);
            if(currentmax <= 0){
                currentmax = 0;

            }
        }
        return maxsofar;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxsubarraysum(arr));

        
    }
}