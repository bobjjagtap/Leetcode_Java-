import java.util.Stack;

public class leetCode_225 {
 Stack<Integer>s=new Stack<>();
    // public MyStack() {
        
    // }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public boolean empty() {
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        leetCode_225 lc=new leetCode_225();
        lc.push(1);
        lc.push(2);
        System.out.println(lc.top());
        System.out.println(lc.pop());
        System.out.println(lc.empty());
    }
}
