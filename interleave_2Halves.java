import java.util.LinkedList;
import java.util.Queue;

public class interleave_2Halves {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int size=q.size();
        Queue<Integer>Q1=new LinkedList<>();
        for (int i = 0; i < size/2; i++) {
           Q1.add(q.remove());
        }
        while(!Q1.isEmpty()){
            q.add(Q1.remove());
            q.add(q.remove());
        }
        for (int i = 0; i < size; i++) {
            System.out.println(q.remove());
        }
    }
}
