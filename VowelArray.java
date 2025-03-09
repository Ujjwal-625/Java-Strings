import java.util.*;

public class VowelArray {
    //method to check if the char is vowel or not 
    public static int toCheckVowel(String s, int a) {
        String result = "";
        //converting upper case to lower case
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                result += (char) (s.charAt(i) + 32);   //+32 converts uppercase to lower case
                } else {
                    result += s.charAt(i);
                    }
                    }
            if((result.charAt(a) >= 97 && result.charAt(a) <= 122) && (result.charAt(a)=='a'||result.charAt(a)=='e'||result.charAt(a)=='i'|| result.charAt(a)=='o'||result.charAt(a)=='u')){
                return 1;
            }
            else if((result.charAt(a) >= 97 && result.charAt(a) <= 122) && (result.charAt(a)!='a'&&result.charAt(a)!='e'&&result.charAt(a)!='i'&& result.charAt(a)!='o'&&result.charAt(a)!='u')){
                return -1;
            
        }
        return 0;
    }
    //method to display and telling which char is vowel or consonant or not a letter
    public static void table(String s){
        String arr[][] = new String[s.length()] [2];
        for(int i=0; i<s.length();i++){
            if(toCheckVowel(s,i)==1){
                arr[i][0]= String.valueOf(s.charAt(i));
                arr[i][1]= "is a Vowel";
            }
            else if(toCheckVowel(s,i)==-1){
               arr[i][0]= String.valueOf(s.charAt(i));
                arr[i][1]= "is not a Vowel";
            }
            else{
               arr[i][0]= String.valueOf(s.charAt(i));
                arr[i][1]= "is not a letter";
            }
        }
        System.out.println("\nCharacter Classification Table:");
        System.out.println(" Character  - Classification");
        // Display table content
        for (int i = 0; i < s.length(); i++) {
            System.out.printf(" %-10s  %-13s \n", arr[i][0], arr[i][1]);
        }
    }
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("String: ");
        //calling the method
        table(str);
        }
    }

/*Enter a string
Hello World
String:

Character Classification Table:
 Character  - Classification
 H           is not a Vowel
 e           is a Vowel
 l           is not a Vowel
 l           is not a Vowel
 o           is a Vowel
             is not a letter 
 W           is not a Vowel
 o           is a Vowel
 r           is not a Vowel
 l           is not a Vowel
 d           is not a Vowel */