import java.util.*;

class Duplicates {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int length = str.length(); //method to find length of the string
        char arr[] = findUniqueChar(str); //method to call the array with unique char
        //output
        for(int i=0;i<length;i++){
            System.out.print(arr[i]);
        }
    }
    //method to remove duplicate elements and store in array
    public static char[] findUniqueChar(String s){
        int length = s.length();
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
hello world
helo wrd
 */