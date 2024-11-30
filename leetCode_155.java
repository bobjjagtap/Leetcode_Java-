import java.util.*;

public class leetCode_155 {
   ArrayList<Integer> list=new ArrayList<>();
    public leetCode_155() {
        
    }
    
    public void push(int val) {
        list.add(val);
        System.out.println(list);
       
    }
    
    public void pop() {
        
        System.out.println("remove is "+list.remove(list.size()-1));
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        // int i=0;
        // int min=Integer.MAX_VALUE;
        // while(i<list.size()){
        //     min=Math.min(list.get(i), min);
        //     i++;
        // }
        return Collections.min(list);
    }

    public static void main(String[] args) {
        leetCode_155 lc=new leetCode_155();
        lc.push(-2);
        lc.push(0);
        lc.push(-3);
        System.out.println(lc.getMin());
        lc.pop();
        System.out.println(lc.top());
        
       System.out.println(lc.getMin());
    }
}
