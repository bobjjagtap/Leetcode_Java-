import java.util.*;

public class linkList {
     public static class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode = new Node(data);
       if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;

    }
    public void jj(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node current=head;
        while(current != null){
            System.out.println(current.data+ "->");
            current=current.next;
        }
        System.out.println( "null");
    }

    public static void main(String[] args) {
      LinkedList ll=new LinkedList();

        ll.addFirst(2);
       
        ll.addFirst(3);
        
        ll.addFirst(1);

         ll.addLast(4);

         ll.addLast(5);

         ll.addLast(9);
        
        
    }
}
