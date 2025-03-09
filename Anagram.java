import java.util.*;

class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        // Check if they are anagrams
        boolean result = checkAnagram(str1, str2);

        // Display result
        if (result) {
            System.out.println("The given strings are anagrams.");
        } else {
            System.out.println("The given strings are NOT anagrams.");
        }
    }

    // 🔹 Method to check if two strings are anagrams
    public static boolean checkAnagram(String s1, String s2) {
        // Step 1: If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for both strings
        int[] frequency1 = new int[256]; // Frequency array for first string
        int[] frequency2 = new int[256]; // Frequency array for second string

        // Step 3: Loop through each character and update frequency
        for (int i = 0; i < s1.length(); i++) {
            frequency1[s1.charAt(i)]++; 
            frequency2[s2.charAt(i)]++;
        }

        // Step 4: Compare both frequency arrays
        return Arrays.equals(frequency1, frequency2);
    }
}
/* Enter the first string: 
hello
Enter the second string:
ohell
The given strings are anagrams.
 */