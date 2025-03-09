import java.util.*;

public class Vowel {
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
    public static void display(String s){
        for(int i=0; i<s.length();i++){
            if(toCheckVowel(s,i)==1){
                System.out.println(s.charAt(i)+" is a vowel");
            }
            else if(toCheckVowel(s,i)==-1){
                System.out.println(s.charAt(i)+" is not a vowel");
            }
            else{
                System.out.println(  s.charAt(i)+" Not a Letter");
            }
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
        display(str);
    }
}
/*nter a string
hello world
String:
h is not a vowel
e is a vowel
l is not a vowel
l is not a vowel
o is a vowel
  Not a Letter
w is not a vowel
o is a vowel
r is not a vowel
l is not a vowel
d is not a vowel */