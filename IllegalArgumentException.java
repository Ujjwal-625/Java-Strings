import java.util.*;

public class IllegalArgumentException {

    static void raiseTheException(String s){
       try {
         String s1=s.substring(1000);
         //entring starting index greater then ending index
         
       } catch (Exception e) {
        System.out.println(e);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        String s=sc.next();

        raiseTheException(s);
        sc.close();
    }
}