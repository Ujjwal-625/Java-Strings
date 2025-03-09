import java.util.*;

public class Split{

    // Method to find the length of a string without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {  // Loop through each character
            count++;
        }
        return count;
    }

    // Method to split text into words using charAt() method (without using split())
    public static String[] splitTextManually(String str) {
        int length = findStringLength(str);
        
        // Count number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String word = "";

        // Extract words manually
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = word;  // Store the word
                word = "";  // Reset for next word
            } else {
                word += str.charAt(i);  // Append character to word
            }
        }
        words[wordIndex] = word; // Store last word
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals(arr2[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Splitting using user-defined method
        String[] manualSplit = splitTextManually(text);

        // Splitting using built-in split() method
        String[] builtInSplit = text.split(" ");

        // Comparing results
        boolean isEqual = compareStringArrays(manualSplit, builtInSplit);

        // Displaying results
        System.out.println("\nWords using manual method:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        // Display comparison result
        if (isEqual) {
            System.out.println("\nBoth methods returned the same words.");
        } else {
            System.out.println("\nMismatch in word extraction!");
        }
    }
}
/*Enter a text: my name is samuel

Words using manual method:
my
name
is
samuel

Words using split() method:
my
name
is
samuel

Both methods returned the same words. */