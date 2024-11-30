import java.util.*;
public class leetCode_202 {
    public static boolean isHappy(int n) {
        int sum=0;
        int i=0;
       ArrayList<Integer> list=new ArrayList<>();
        while(n>0){ 
            sum+=(n%10)*(n%10);
            n=n/10;
            if(n==0){
                if(sum!=1){
                    n=sum;
                    
                    if(list.contains(n)){
                        return false;
                    }
                    System.out.println(sum);
                    list.add(sum);
                    sum=0;
                    
                }else{
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(isHappy(n));
    }
}
