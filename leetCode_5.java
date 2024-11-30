// public class leetCode_5 {
//     public static void find(String str) {

        
//     }
//     public static void main(String[] args) {
//         String str="adababababdkdaxisahhha";
//         find(str);
//     }
    
// }
class leetCode_5 {
     static int maxlen=0,star=0;
    public static int longestPalindrome(String s) { 
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length; i++) {
            start(input,i,i);
            start(input,i,i+1);
        }
        return maxlen;
    }
    public static void start(char input[],int i,int j){
        while(i>=0 && j<input.length && input[i]==input[j]){
            i--;
            j++;
        }if(maxlen < j-i-1){
            maxlen=j-i-1;
            star=j+1;
        } 
    }
    public static void main(String args[]) {
        // Your code goes here
        String s = "adababababdkdaxisahhhaaaaaaaaaahhha";
        System.out.println(longestPalindrome(s));
    }
}
