import java.util.*;

public class CreatingSubstring {
    static void isEqual(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("Strings are not equal using CharAt");
                return ;
            }
        }
        System.out.println("Strings are equal using charAt");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter String");
        String s=sc.next();

        String substr=s.substring(0);//starting from index 0 to the last index
        // System.out.println(substr);

        CompareStirngs(s,substr);
        sc.close();
    }
}