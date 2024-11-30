import java.util.LinkedList;
import java.util.*;
import LinkedList.Node;
public class LinkedList1 {
    static Node head;
    static Node tail;
    public static class Node{
        Node next;
        int data;
        Node(int n){
            next=null;
            data=n;
        }
    }
    private Node merge_sorted(Node head){

    }
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(3);
        ll.head=ll.merge_sorted(ll.head);
        
    }
}
