import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class non_repeting_char {
    public ArrayList check(char[] ch) {
        int arr[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        ArrayList list=new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            int sum=ch[i]-'a';
            arr[sum]+=1;
            if(arr[sum]<2){
                q.add(ch[i]);
                list.add(q.peek());
            }else{
                if(q.contains(ch[i])){
                    q.remove(ch[i]);
                }
                if(q.isEmpty()){
                   list.add(-1);
                }
                else{
                    list.add(q.peek());
                }
            }
        }
        // while(!q.isEmpty()){
        //     System.out.print(","+q.peek());
        //     q.remove();
        // }
        return list;
    }

    public static void main(String[] args) {
        non_repeting_char n=new non_repeting_char();
        char[] ch={'a','a','a','b','c','c','x','a','b','c'};
        System.out.println(n.check(ch));
    }
}
