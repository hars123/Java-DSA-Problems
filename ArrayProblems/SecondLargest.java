// // // public class SecondLargest {
// // //     public static void main(String[] args) {
// // //         int[] arr = {10, 20, 4, 45, 99};
// // //         int largest = arr[0], secondLargest = Integer.MIN_VALUE;

// // //         for (int num : arr) {    
            
// // //             if (num > largest) {
// // //                 largest = num;
// // //             }
// // //         }

       
// // //         for (int num : arr) {   
// // //             if (num > secondLargest && num < largest) {
// // //                 secondLargest = num;
// // //             }
// // //         }

       
// // //         if (secondLargest == Integer.MIN_VALUE) {
// // //             System.out.println("No second largest element.");
// // //         } else {
// // //             System.out.println("Second largest element: " + secondLargest);
// // //         }
// // //     }
// // // }


// public class SecondLargest {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int largest = arr[0];
//         int secondlar = 0;
        

//         for(int num : arr){
//             if(num > largest){
//                 largest = num;
//             }
//         }

//         for(int num : arr){
//             if(num > secondlar && num<largest){
//                 secondlar = num;
//             }
//         }

//      if(num == Integer.MIN_VALUE){
//         System.out.println("No elemenet");
//      }else{
//         System.out.println(secondlar);
//      }
        
//     }
// }




public class SecondLargest {

    public static void findsecondlargestnumber(int arr[]){
        int largest = arr[0];
        int secondlargest = 0;

        for(int num :arr){
            if(num > largest){
                largest = num;
            }

          
        }

        for(int num : arr){
            if(num > secondlargest && num<largest){
                secondlargest = num;
            }
        }
        System.out.println(secondlargest);

    }

    public static void main(String[] args) {
        int arr[] = {12,22,3,44,3};
        findsecondlargestnumber(arr);

    }
}