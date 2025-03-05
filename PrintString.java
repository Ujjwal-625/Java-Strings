import java.util.*;

public class PrintString {

    static void isEqual(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("Strings are not equal using CharAt");
                return ;
            }
        }
        System.out.println("Strings are equal using charAt");
    }

    static char [] StringToCharArray(String str){
       return str.toCharArray();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        String s=sc.next();

        char arr[]=StringToCharArray(s); //converted to char array
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}