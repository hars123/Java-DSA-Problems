// Write a Code to check whether one string is a rotation of another

public class Roatatationofanotherstringornot {

    public static void main(String[] args) {
        String  S1 = "ABCD";
        String  S2 = "DCBA";
        if(S1.length() != S2.length()){
            System.out.println(" Not A Rotation ");
            System.exit(0);
        }  

        String S3 = S1+S1; 
        if(S3.indexOf(S2) != -1){
            System.out.println("String is Roatation");

        }else{
            System.out.println("Not a Rotation");

        }




    }

}