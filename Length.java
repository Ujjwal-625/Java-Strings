import java.util.*;
public class Length {

    // Method to find length of string without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        for (int i = 0; i >= 0; i++) {  // Infinite loop until exception occurs
            try {
                str.charAt(i); 
                count++;  
            } catch (StringIndexOutOfBoundsException e) {  
                break;  // Stop when exception occurs
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int customLength = findStringLength(str);

        // Finding length using built-in method
        int builtInLength = str.length();

        // Displaying the results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        // Comparing results
        if (customLength == builtInLength) {
            System.out.println("Both methods returned the same length.");
        } else {
            System.out.println("Mismatch in calculated length!");
        }
    }
}
/*Enter a string: hello
Length using custom method: 5
Length using built-in length() method: 5
Both methods returned the same length. */