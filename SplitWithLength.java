import java.util.Scanner;

public class SplitWithLength {

    // Method to find the length of a string without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {  // Loop through each character
            count++;
        }
        return count;
    }

    // Method to split text into words using charAt() method 
    public static String[] splitTextManually(String str) {
        int length = findStringLength(str);

        int wordCount = 1;  // 
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
                words[wordIndex++] = word; 
                word = "";  // Reset for next word
            } else {
                word += str.charAt(i);  
            }
        }
        words[wordIndex] = word; // Store last word
        return words;
    }

    // Method to return a 2D String array containing words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store word
            result[i][1] = String.valueOf(findStringLength(words[i])); // Store word length as String
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Splitting text manually into words
        String[] words = splitTextManually(text);

        // Getting words with their lengths in a 2D array
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Displaying result in tabular format
        System.out.println("\nWord\t\tLength");
        for (String[] row : wordsWithLengths) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1])); // Convert length back to int for display
        }
    }
}
/*Enter a text: my name is samuel

Word            Length
my              2
name            4
is              2
samuel          6 */