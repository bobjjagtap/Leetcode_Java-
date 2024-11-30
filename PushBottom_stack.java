import java.util.Stack;

public class PushBottom_stack {
    public static void pushBottom(int n,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
       int top=s.pop();
       
        pushBottom(n, s);
        System.out.println("yw=es");
        s.push(top);
        return;
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushBottom(5,s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
