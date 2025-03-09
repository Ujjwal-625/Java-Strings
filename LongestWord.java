import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longest = toFindLongest(words);
        System.out.println("Longest String: ");
        System.out.println(longest);

    }
    public static String toFindLongest(String[] arr){
        int max = 0;
        String longest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                longest = arr[i];
                }
    }
    return longest;
}
}
/*Enter a String:
My name is samuel
Longest String: 
samuel
 */