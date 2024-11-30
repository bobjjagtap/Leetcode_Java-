import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetCode_150{
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for (String string : tokens) {
            if(string.equals("+") || string.equals("-") || string.equals("/") || string.equals("*") ){
                int b=s.pop();

                int a=s.pop();
                
                int res=cal(a, b, string.charAt(0));
                s.push(res);
                
            }else{
                s.push(Integer.parseInt(string));
            }
        }
        return s.pop();
    }
    public int cal(int a,int b,char str){
        if(str=='+'){
            return a+b;
        }else if(str=='-'){
            return a-b;
        }else if(str=='*'){
            return a*b;
        }else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        leetCode_150 lc=new leetCode_150();
        String[] tokens={"5","1","*","3","+"};
        System.out.println(lc.evalRPN(tokens));
    }
}