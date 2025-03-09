public class CanVote {
    //main method
    public static void main(String[] args) {
        //input
        int number =10;
        //calling declare method
        int age[] =declareAge(number);
        //calling checkvote method
        String[][] result = checkVote(age, number);
        //output
        System.out.println("Age  -   VoteCheck");
        for(int i=0;i<number;i++){
            System.out.println(result[i][0]+"   -   "+result[i][1]);
        }
       
    }
    //method to get ages
    public static int[]declareAge(int number){
        int[] arr =new int[number];
        for(int i=0;i<number;i++){
            arr[i] = (int)(Math.random()*90) +10;
        }
        return arr;
    }
    //method to check if the person can vote or not
    public static String[][] checkVote(int[] arr,int number){
        String[][] result = new String[number][2];
        for(int i=0;i<number;i++){
            result[i][0] = String.valueOf(arr[i]);
            if(arr[i]>17){
                result[i][1] = "Can Vote";
            }
            else{
                result[i][1] = "Can not Vote";
                }
    }
    return result;
}
}
/* Age  -   VoteCheck
36   -   Can Vote
48   -   Can Vote
61   -   Can Vote
20   -   Can Vote
88   -   Can Vote
55   -   Can Vote
31   -   Can Vote
30   -   Can Vote
78   -   Can Vote
86   -   Can Vote*/