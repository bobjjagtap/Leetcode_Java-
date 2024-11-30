import java.util.ArrayList;
import java.util.Collections;

public class leetCode_148 {
    Node head;
    Node tail;
    public class Node{
        Node next;
        int data;
        Node(int n){
            data=n;
            next=null;
        }
    }
    public void addLast(int n){
        Node newnode=new Node(n);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;


    }
    public void sortList(){
        Node temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        Node finall=null;
        for (int i = 0; i < list.size(); i++) {
            Node newnode=new Node(list.get(i));
            if(finall==null){
                finall=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
        }
        head=finall;
     Node temp1=head;
        while(temp1!=null){
        System.out.print(temp1.data+"->");
        temp1=temp1.next;
    }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
}
    public static void main(String[] args) {
        leetCode_148 lc=new leetCode_148();
        lc.addLast(-1);
        //lc.sortList();
        lc.print();
    }
}
