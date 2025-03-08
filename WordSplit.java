import java.util.*;

public class WordSplit {

    static String [] SplitString(String s){
        return s.split(" ");
    }

    static  int countWords(String s){
        return s.split(" ").length;
    }

    static boolean compareStrings (String s1,String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter  the word ");
        String s=sc.nextLine();

        // we will try to split the word with space as delimiter

        String words[]=SplitString(s);

        System.out.println(s);

        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+"-");
        }


        sc.close();
    }
}