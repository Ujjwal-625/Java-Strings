import java.util.*;

class Palindrome {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Checking palindrome using all 3 logic methods
        boolean logic1 = checkLogic1(str);
        boolean logic2 = checkLogic2(str, 0, str.length() - 1);
        boolean logic3 = checkLogic3(str);

        // Display results
        System.out.println("\nResults using different logics:");
        System.out.println("Logic 1  : " + (logic1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2  : " + (logic2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3  : " + (logic3 ? "Palindrome" : "Not a Palindrome"));
    }

    // 🔹 Logic 1: Iterative Approach (Compare Start & End Characters)
    public static boolean checkLogic1(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false; // If any character mismatch, it's not a palindrome
            }
        }
        return true; 
    }

    // 🔹 Logic 2: Recursive Approach (Compare Start & End Characters)
    public static boolean checkLogic2(String s, int start, int end) {
        // Base Case: If start crosses end, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If characters don't match, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        // Recursive Call: Check inner substring
        return checkLogic2(s, start + 1, end - 1);
    }

    // 🔹 Logic 3: Using Character Array & Reverse String Comparison
    public static boolean checkLogic3(String s) {
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
aabbaa

Results using different logics:
Logic 1  : Palindrome
Logic 2  : Palindrome
Logic 3  : Palindrome
 */