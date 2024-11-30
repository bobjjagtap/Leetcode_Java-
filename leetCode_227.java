import java.util.ArrayList;
import java.util.Stack;

public class leetCode_227 {
    public static int calculate(String s) {
        s=s.replaceAll("\\s","");
        char arr[]=s.toCharArray();
        int nums=0;
        char opretor='+';
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isDigit(arr[i])){
                nums=nums*10+(int)(arr[i]-'0');
            }if(!Character.isDigit(arr[i])||i==arr.length-1){
                if(opretor=='+'){
                    st.push(nums);
                }
                if(opretor=='-'){
                    st.push(-nums);
                }if(opretor=='*'){
                    st.push(st.pop()*nums);
                }
                if(opretor=='/'){
                    st.push(st.pop()/nums);
                }
                nums=0;
                opretor=arr[i];
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
    public static void main(String[] args) {
        String s=" 3+5/2*5-1 ";
        System.out.println(calculate(s));
    }
}
