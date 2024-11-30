import java.util.*;
public class String_Matching {
    public static int solvee(int n,String words[]) {
        Arrays.sort(words);
        int max=Integer.MAX_VALUE;
        
        for (int i = 0; i < words.length-1; i++) {

            for (int l = i+1; l < words.length; l++) {
                int sum=0;
            for (int j = 0; j < words[i].length(); j++) {
                
                    
                 if(words[i].charAt(j)<=words[l].charAt(j)){
                     sum+=words[l].charAt(j)-words[i].charAt(j);
                 }  else{
                    sum+=words[i].charAt(j)-words[l].charAt(j);
                 }
            }
            
            max=Math.min(sum,max );
        }
        }
        return max;

    }
    public static void main(String[] args) {
        int n=5;
        String words[]={"ab","ab","ab"};
        System.out.println(solvee(n,words));
    }


}
