import java.util.*;

class Reverse {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter a String: ");
        String str =sc.nextLine();
        char[] arr = toReverseString(str); //calling method to take arr values
        //output
        System.out.println("Reversed String: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
    }
    //method to reverse string
    public static char[] toReverseString(String s){
        int n = s.length(); //length of string
        int index =0;
        char[] arr = new char[n];
        for(int i = n-1; i >=0; i--) { //reverse loop to add reverse element in array
            arr[index] = s.charAt(i);
            index++;
    }
    return arr;
}
}
/*Enter a String: 
hello
Reversed String:
o l l e h
*/