import java.util.*;

public class CompareStirngs {
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
        System.out.println("Enter String 1");
        String s1=sc.next();
        System.out.println("Enter String 2");
        String s2=sc.next();

        isEqual(s1,s2);

        if(s1.equals(s2)){
            System.out.println("Strings are equal using .equals method");
        }
        else
        System.out.println("Strings are not equal using .equals method");
        sc.close();
    }
}