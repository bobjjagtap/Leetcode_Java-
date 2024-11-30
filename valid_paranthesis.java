import java.util.Stack;

public class valid_paranthesis {
    public static boolean chack(String str) {
        Stack <Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='{'){
                s.push('}');
            }else if(str.charAt(i)=='['){
                s.push(']');
            }else if(str.charAt(i)=='('){
                s.push(')');
            }else if(s.isEmpty()){
                return false;
            }
            else if(str.charAt(i)==s.peek()){
                    s.pop();         
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="(((()))())";
        System.out.print(chack(str));
    }
}
