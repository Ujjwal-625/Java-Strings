import java.util.*;

public class Trim {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter the string: ");
        String str =sc.nextLine();
        //trim using in built method
        String str1 = str.trim();
        System.out.println("String using trim()=> " + str1);
        //calling method to trim using charAt
        System.out.println("String charAt=> " + toTrim(str));
        String result = toTrim(str1);
        //printing if results are same or not
        if(str1.equals(result)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Not same");
            }

}
//method to trim using charAt
    public static String toTrim(String s){
        int start =0;
        int end =0;
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)!=32){ //32 is ascii value of blank space
                start = i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if((int)s.charAt(i)!=32){
                end = i;
                break;
            }
        }
            String result ="";
            for(int i=start;i<=end;i++){
                result+=s.charAt(i);
            }
        
        return result;
    }
}
/*Enter the string: 
    hello world  
String using trim()=> hello world
String charAt=> hello world
Both are same
 */