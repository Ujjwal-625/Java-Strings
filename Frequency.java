import java.util.Scanner;

public class Frequency {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] result = findFrequency(str);

        // Display the frequency table
        System.out.println("\nCharacter Frequency:");
        for (String[] row : result) {
            System.out.println(row[0] + " --> " + row[1]);
        }
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String str) {
        int[] frequency = new int[256]; // Array to store character frequencies

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store unique characters and their frequencies in a 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }
}
/*Enter a string: Hello World

Character Frequency:
  --> 1
H --> 1
W --> 1
d --> 1
e --> 1
l --> 3
o --> 2
r --> 1
 */