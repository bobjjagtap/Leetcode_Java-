import java.util.*;
import java.util.LinkedList;
public class leetCode_21 {
     static Node head1;
     static Node head2;
            Node tail;
    public class Node{
        Node next;
        int data;
        Node(int n){
            next=null;
            data=n;
        }
    }

   public void addLast2(int b) {
        Node newnode = new Node(b);
        if (head2 == null) {
            head2 = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void addLast1(int b) {
        Node newnode = new Node(b);
        if (head1 == null) {
            head1 = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public Node mergeTwoLists(Node list1, Node list2) {
        if(list1==null){
            return list2;
        }if(list2==null){
            return list1;
        }
         Node MeargeHead=null;
        if(list1.data<=list2.data){
            MeargeHead=list1;
            list1=list1.next;
        }
        else{
             MeargeHead=list2;
             list2=list2.next;
        }

        Node MeargeTail=MeargeHead;
        while(list1!=null&&list2!=null){
            Node temp=null;
            if(list1.data<=list2.data){
            temp=list1;
            list1=list1.next;
        }
        else{
             temp=list2;
             list2=list2.next;
        }
        MeargeTail.next=temp;
        MeargeTail=temp;
        }
        if(list1!=null){
            MeargeTail.next=list1;
        }else if(list2!=null){
            MeargeTail.next=list2;
        }
        Node temp1=MeargeHead;
        while(temp1!=null){
            System.out.print(temp1.data+"->");
            temp1=temp1.next;
        }
        return MeargeHead;
    }
    public static void main(String[] args) {
        leetCode_21 list=new leetCode_21();
        list.addLast1(2);
        list.addLast1(3);
        list.addLast1(5);
        list.addLast2(1);
        list.addLast2(4);
        list.addLast2(5);
        list.mergeTwoLists(head1, head2);
    }
}
