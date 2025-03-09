import java.util.*;

class Palindrome {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // calling method to Check palindrome 
        boolean logic = checkPalindrome(str);
        if (logic == true) {
            System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
                }

    }
      // Using Character Array & Reverse String Comparison
      public static boolean checkPalindrome(String s) {
        char[] original = s.toCharArray(); // Convert string to char array
        char[] reversed = new char[s.length()];

        // Reverse the original array
        for (int i = 0; i < s.length(); i++) {
            reversed[i] = original[s.length() - 1 - i];
        }

        // Compare both arrays
        return Arrays.equals(original, reversed);
    }
}
/*Enter a string: 
abba
The string is a palindrome. 
 */