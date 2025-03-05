import java.util.*;

public class NullPointerException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        String s=null;
        try {
        s.substring(0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        

        sc.close();
    }
}