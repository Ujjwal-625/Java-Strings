import java.util.*;

class ToggleCase {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string: ");
        String str =sc.nextLine();
        String result = toToggle(str); //calling method which has toggle string
        //output
        System.out.println("Toggle case of string: " +result);
    }
    //method to toggle string
    public static String toToggle(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) { //to check if char at that index is upper case
                result += Character.toLowerCase(s.charAt(i)); //convert upper case char to lower case char
                } else {
                    result += Character.toUpperCase(s.charAt(i));
                }  
    }
    return result;
}
}
/*Enter a string: 
Hello World
Toggle case of string: hELLO wORLD
 */