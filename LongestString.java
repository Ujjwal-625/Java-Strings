import java.util.*;

public class LongestString { 
    // Method to find the length of a string 
    public static int findStringLength(String str) {
        int count = 0;
        for (int i = 0; i >= 0; i++) { 
            try {
                str.charAt(i);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break; 
            }
        }
        return count;
    }

    // Method to split text into words manually without using split()
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

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex] = word; // Store the word
                wordIndex++;
                word = ""; // Reset for next word
            } else {
                word += str.charAt(i);
            }
        }
        words[wordIndex] = word; // Store the last word
        return words;
    }
    // Method to store words and their lengths in a 2D String array
    public static String[][] getWordsWithLengths(String[] words) {
        int wordCount = findStringLength(words[0]); // Finding length manually
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store word
            result[i][1] = String.valueOf(findStringLength(words[i])); // Store word length as String
        }
        return result;
    }
    // Method to find shortest and longest words from 2D array
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = Integer.parseInt(wordsWithLengths[0][1]);

        for (int i = 1; i < wordsWithLengths.length; i++) { // Proper iteration
            int length = Integer.parseInt(wordsWithLengths[i][1]);

            if (length < shortestLength) {
                shortest = wordsWithLengths[i][0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = wordsWithLengths[i][0];
                longestLength = length;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Splitting text manually into words
        String[] words = splitTextManually(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] minMaxWords = findShortestAndLongest(wordsWithLengths);
        // Displaying results
        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }
        System.out.println("\nShortest Word: " + minMaxWords[0]);
        System.out.println("Longest Word: " + minMaxWords[1]);
    }
}
