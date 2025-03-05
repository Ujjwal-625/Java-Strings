import java.util.*;

public class IndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        String s="BridgeLabz";
        //now try to access index which does not exist
        try {
            System.out.println(s.charAt(100));
        } catch (Exception e) {
            System.out.println("exception handled");
            System.out.println(e);
        }
        sc.close();
    }
}