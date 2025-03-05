import java.util.*;

public class NumberFormatException {

    static void generateException(String s){
        try {
            int i=Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Exception handled in try catch block");
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        String s=sc.next();

        generateException(s);
        sc.close();
    }
}