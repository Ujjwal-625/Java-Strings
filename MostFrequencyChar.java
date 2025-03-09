import java.util.*;

public class MostFrequencyChar {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        //output
        System.out.println("Most Frequent Character: " + findFrequency(str));

    }

    // Method to find the frequency of characters in a string
    public static char findFrequency(String str) {
        int[] frequency = new int[256]; // Array to store character frequencies

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }
        int maxFrequency = 0;
        char maxChar = ' ';
        // Find the character with maximum frequency
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                maxChar = (char) i;
                }
                }
                return maxChar;
        }
    }
    /*Enter a string: success
Most Frequent Character: s
 */