public class leetCode_1768 {
    public static void check(String word1,String word2) {
        String temp="";
        int max=Math.max(word2.length(),word1.length());
        int i = 0,j=0,k=0;
        while ( k < max) {
            if(i < word1.length()){
            temp+=Character.toString(word1.charAt(i));
            i++;
            }
            if(j<word2.length()){
            temp+=Character.toString(word2.charAt(j));
            j++;
            }
            k++;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        String word1="jayesh";
        String word2="jagt";
        check(word1,word2);    }
}
