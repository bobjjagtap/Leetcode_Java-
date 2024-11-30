import java.util.Stack;

public class leetCode_901 {
    class pair{
    int x;
    int span;
    pair(int stock_price,int stock_span){
        x=stock_price;
        span=stock_span;
    }
}
Stack <pair>stack;
    public void  StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int span_no=1;
        while(!stack.isEmpty() && stack.peek().x<=price){
            pair p=stack.pop();
            
            span_no=span_no+ p.span;
        }
        stack.push(new pair(price, span_no));
        return span_no;
    }
    public static void main(String[] args) {
       leetCode_901 lc=new leetCode_901();
       lc.StockSpanner();
       int array[]={100,80,60,70,60,75,85};

       for (int i = 0; i < array.length; i++) {
        System.out.println( lc.next(array[i]));
       }

    }
}
