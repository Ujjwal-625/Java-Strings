import java.util.Scanner;

class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring to find: ");
        String subStr = sc.nextLine();

        // Count occurrences using split() method
        int count = countSubstringOccurrences(str, subStr);
        // Print the result
        System.out.println("Occurrences of '" + subStr + "': " + count);
    }
    // Method to count occurrences of a substring using split()
    public static int countSubstringOccurrences(String str, String subStr) {
        if (subStr.isEmpty()) return 0; // Edge case: Empty substring

        String[] parts = str.split(subStr);
        // The number of occurrences is (number of parts - 1)
        return parts.length - 1;
    }
}
/*Enter the main string: Hello llpe
Enter the substring to find: ll
Occurrences of 'll': 2
 */