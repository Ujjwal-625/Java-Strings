import java.util.*;

class Frequency2 {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Find unique characters
        char[] uniqueChars = findUniqueChar(str);
        String[][] result = findFrequency(str, uniqueChars);

        // Display the frequency table
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < uniqueChars.length; i++) {
            if (result[i][1] != null && !result[i][1].equals("0")) {
                System.out.println(result[i][0] + " --> " + result[i][1]);
            }
        }
    }

    // Method to find the length of the string without using length()
    public static int findStringLength(String str) {
        int length = 0;
        for (int i = 0; i >= 0; i++) {
            try {
                str.charAt(i);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters
    public static char[] findUniqueChar(String s) {
        int length = findStringLength(s);
        Set<Character> uniqueSet = new LinkedHashSet<>(); // Using LinkedHashSet to maintain order

        for (int i = 0; i < length; i++) {
            uniqueSet.add(s.charAt(i));
        }

        char[] uniqueChars = new char[uniqueSet.size()];
        int index = 0;
        for (char ch : uniqueSet) {
            uniqueChars[index++] = ch;
        }

        return uniqueChars;
    }

    // Method to find frequency of characters
    public static String[][] findFrequency(String str, char[] uniqueChars) {
        int[] frequency = new int[256]; // Array to store character frequencies

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // Store unique characters and their frequencies in a 2D array
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]); // Character
            result[i][1] = Integer.toString(frequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }
}
