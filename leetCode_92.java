import java.util.*;

import org.w3c.dom.Node;

public class leetCode_92 {
    static ListNode head;
    public static class ListNode{
        ListNode next;
        int data;
        ListNode(int n){
            data=n;
            next=null;
        }
    }
    public void addLast(int b) {
        Node newnode = new Node(b);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    print()
    public static void main(String[] args) {
        leetCode_92 ll=new leetCode_92();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
    }
}
