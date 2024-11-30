import java.util.*;

public class reverse_stack {
    public static String reversString(String s){

        Stack<Character> c=new Stack<>();
        int d=0;
        if(s.length()==0 || s.length()==1){
            return s;
        }
        while(d<s.length()){
            c.push(s.charAt(d));
            d++;
        }
        StringBuilder result=new StringBuilder();
        while(!c.isEmpty()){
            char top=c.pop();
            result.append(top);
            System.out.println(result);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s="jayesh";
        
        String ans=reversString(s);
        System.out.println(ans);

    }
}
