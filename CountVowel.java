import java.util.*;

public class CountVowel {
      //main method
      public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("String: ");
        int [] arr =display(str);
        //calling the method
        System.out.println("Number of Vowels: " + arr[0]);
        System.out.println("Number of Consonants: " + arr[1]);

    }
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
    //method to count number of vowels and consonants
    public static int[] display(String s){
        int vowel =0;
        int consonant =0;
        for(int i=0; i<s.length();i++){
            if(toCheckVowel(s,i)==1){
                vowel++;
            }
            else if(toCheckVowel(s,i)==-1){
                consonant++;
            }
            else{
            }
        }
        return new int[]{vowel,consonant};
    }
}
/* Enter a string
hello
String:
Number of Vowels: 2
Number of Consonants: 3
*/