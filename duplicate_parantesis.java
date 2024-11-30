import java.util.Stack;

public class duplicate_parantesis {
    public static boolean chack(String str) {
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//when not valid 
                }else{
                    s.pop();
                }
            }
            else{
                s.push(str.charAt(i));
            }
        }
        return false;//when valid string
    }
    public static void main(String[] args) {
        String str="(a+b)(c+d)";
        System.out.println(chack(str));
    }
}
