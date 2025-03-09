import java.util.*;

class UniqueChar {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int Slength = findStringLength(str); //call method to find length of the string
        char arr[] = findUniqueChar(str); //method to call the array with unique char
        //output
        for(int i=0;i<Slength;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int findStringLength(String str) {
        int length = 0;
        for (int i = 0; i >= 0; i++) {  // Infinite loop until exception occurs
            try {
                str.charAt(i); 
                length++;  
            } catch (StringIndexOutOfBoundsException e) {  
                break;  // Stop when exception occurs
            }
        }
        return length;
    }
    //method to find unique characters
    public static char[] findUniqueChar(String s){
        int length = findStringLength(s);
        int count = 0;
        char arr[] = new char[length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(s.charAt(i)!=arr[j]){
                    count++;
                }
                if(count==length){  //if this happens means the char has not been repeated
                    arr[i]=s.charAt(i);
                } 
        }
        count =0; //count reset to  0 again when j loops end
    }
    return arr;
}
}
/*Enter a string: 
Hello World
H e l  o   W  r  d 
 */
