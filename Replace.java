import java.util.*;

public class Replace {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a word to replace: ");
        String word = sc.nextLine();
        System.out.println("Enter a word to replace with: ");
        String replace = sc.nextLine();
        String result = replaceWord(str,word,replace); //calling the method replace to replace the old string with new
        //output
        System.out.println("New String: "+ result);
    }
    //method to replace
    public static String replaceWord(String s, String word,String replace ){
        return s.replace(word,replace); //replace method to replace a  specifc word with another in a string

    }
}
/*Enter a string: 
My name is samuel
Enter a word to replace: 
is
Enter a word to replace with: 
to
New String: My name to samuel
 */
