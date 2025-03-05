import java.util.*;

public class Exception4 {
    static void raiseTheException(int arr[]){
        try {
            System.out.println(arr[100]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception handled in try catch");
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        raiseTheException(arr);
        sc.close();
    }
}