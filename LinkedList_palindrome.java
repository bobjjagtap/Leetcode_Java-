import java.util.*;
import java.util.LinkedList;
public class LinkedList_palindrome {
    Node head;
    Node tail;
    public class Node{
        int data;
        Node next;
        Node(int s){
            data=s;
            next=null;
        }
    }
    public void addLast(int n){
        Node newnode=new Node(n);
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;

    }
     public void add(int n){
        Node newnode=new Node(n);
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;

    }
    public void print(){
        
        Node j=head;
        while(j!=null){
            System.out.print(j.data+"->");
            j=j.next;
        }
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean chackpalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=findMid(head);
        Node prev=null;
        Node next;

        while(mid!=null){
            next=mid.next;
            mid.next=prev;
            prev=mid;
            mid=next;
        }
       
        
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            else{
                right=right.next;
                left=left.next;
            }
        }
       
        //  while(prev!=null){
        //     tail.next=prev;
        //     tail=prev;
        //     prev=prev.next;
        // }
        return true;
    }
    
    public static void main(String[] args) {
        LinkedList_palindrome list=new LinkedList_palindrome();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        
        System.out.println(list.chackpalindrome());
        list.print();

  
        

    }
}
