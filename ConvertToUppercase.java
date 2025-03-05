import java.util.*;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        String s=sc.nextLine();

        String upper=s.toUpperCase();

        System.out.println("initially string "+s);
        System.out.println("After string "+upper);
        sc.close();
    }
}