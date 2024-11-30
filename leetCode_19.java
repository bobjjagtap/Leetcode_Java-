import java.util.*;
//accepted
public class leetCode_19 {
    Node head;
    Node tail;
    int size = 0;

    public class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public void add(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void size() {
        Node temp = head;
       
    }

    public Node removeNth(int n) {
        Node temp1 = head;
         while (temp1 != null) {
            size++;
            temp1=temp1.next;
        }if(size==n){
            head=head.next;
            return head;
        }else{
        n=size-n;
        size=1;}
        Node temp=head;
        while (temp != null) {
            if (size == n ) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            size++;
        }
        return head;

    }

    public void print() {
        Node temp = head;
        System.out.println();
        System.out.println(" after remove Nth term");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        leetCode_19 lc = new leetCode_19();
        lc.add(1);
        lc.add(2);
        lc.add(3);
        lc.add(4);
        lc.add(5);
        // lc.add(5);
        // lc.add(5);
        // lc.add(5);
        lc.print();
        lc.removeNth(5);
        lc.print();

    }
}
