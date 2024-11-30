
public class LeetCode_24 {
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
    public void addLast(int b) {
        Node newnode = new Node(b);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void swap(){
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                break;
            }else{
            int tem=temp.data;
            temp.data=temp.next.data;
            temp.next.data=tem;
            temp=temp.next.next;
            }
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
        LeetCode_24 list=new LeetCode_24();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("befour");
        list.print();
        list.swap();
        System.out.println();
        System.out.println("after");
        list.print();
        
    }
}
Node temp=head;
            Node prev=tail;
            int i=0,k=4;
            while(i<k){
                prev.next=temp;
                temp=prev;
                temp.next.next.next.next.next=null;
                temp=temp.next.next.next.next;
                i++;
            }
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }