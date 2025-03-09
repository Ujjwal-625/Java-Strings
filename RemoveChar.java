import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Character to remove: ");
        String character =sc.nextLine();
        char ch =character.charAt(0);
        System.out.println("Modified String: " + removeChar(str, ch));

    }
    public static String removeChar(String s, char ch){
        String result ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==(ch)){
                continue;
            }
            else{
                result=result+s.charAt(i);
            }
        }
    return result;
}
}

/*Enter a string: hello
Character to remove: 
l
Modified String: heo
 */