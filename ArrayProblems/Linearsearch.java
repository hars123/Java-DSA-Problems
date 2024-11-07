public class Linearsearch {
    public static void main(String[] args) {
        int number = 2;
        int flag = 0;
        int arr[] = {1,2,3,4,5,6,7};
        for(int i = 0;i<arr.length;i++){
            if(number == arr[i]){
                flag = 1;
                break;
            }
            
        } 
        if(flag == 1) System.out.println("Number is pesent");
        else System.out.println("Not presnt");
    }
    
}
