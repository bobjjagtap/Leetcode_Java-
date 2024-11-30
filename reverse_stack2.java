import java.util.Stack;

public class reverse_stack2 {
    public static void pushBottom(int n,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
       int top=s.pop();
       System.out.println("second top is "+top);
       
        pushBottom(n, s);
        s.push(top);
        return;
    }
    public static void reverse(Stack<Integer> s){
        while(s.isEmpty()){
            return;
        }
        int top=s.pop();
        System.out.println("top is "+top);
        reverse(s);
        System.out.println("final top is "+top);
        pushBottom(top,s);

    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1); 
        s.push(2); 
        s.push(3); 
        s.push(4);
        reverse(s);
        print(s); 
    }
}
