import java.util.Stack;

public class leetCode_224 {
    public static int calculate(String s) {
        int nums=0,ans=0,sign=1;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
       if(Character.isDigit(c)){
           nums=nums*10+(int)(c-'0');
       }
       else if(c=='+'){
           ans+=sign*nums;
           sign=1;
           nums=0;
       }
       else if(c=='-'){
           ans+=sign*nums;
           sign=-1;
           nums=0;
       }
       else if(c=='('){
           st.push(ans);
           st.push(sign);
           sign=1;
           ans=0;
       }
       else if(c==')'){
           ans+=sign*nums;
           nums=0;
           ans*=st.pop();
           ans+=st.pop();
       }
        }
        if(nums!=0){
            ans+=sign*nums;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(calculate("(1+(5+4+2)-3)"));
    }
}
