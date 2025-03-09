import java.util.*;

class NonRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char result = findNonRepeatChar(str);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Method to find the first non-repeating character
    public static char findNonRepeatChar(String str) {
        int[] frequency = new int[256];  // Array to store character frequencies

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;  
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch;  // Return first non-repeating character
            }
        }

        return '\0';  // Return null character if no unique character found
    }
}
/*

Enter a string: Hello world
First non-repeating character: H
*/
