import java.util.*;
public class stock_spam_problem {
    public static void chack(int[] arr,int[] spam) {
        Stack<Integer> s=new Stack<>();
        spam[0]=1;
        s.push(0);
        for (int index = 1; index < arr.length; index++) {
            int current=arr[index];
            while(!s.isEmpty() && current>arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                spam[index]=index+1;
            }else{
                int prevHigh=s.peek();
                spam[index]=index-prevHigh;
            }
            s.push(index);
        }
    }
    public static void main(String[] args) {
        int arr[]={100,80,90,70,60,85,100};
        int spam[]=new int[arr.length];
        chack(arr,spam);
        for (int i = 0; i < spam.length; i++) {
            System.out.println(spam[i]);
        }
    }
}
