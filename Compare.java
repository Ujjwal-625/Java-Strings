import java.util.*;

class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare the strings lexicographically
        int result = compareStrings(str1, str2);

        // Print the result based on comparison
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i); // Difference of ASCII values
            }
        }

        // If one string is a prefix of the other, the shorter one comes first
        return str1.length() - str2.length();
    }
}
