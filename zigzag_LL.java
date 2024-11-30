public class zigzag_LL {
    Node head;
    Node tail;
    public class Node{
        Node next;
        int data;
        Node(int n){
            next=null;
            data=n;
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
    public void zigzag(){
        //Node temp = head;
        // Node tail=null;
        // System.out.println(tail.data);
        // Node prev =tail;
        // int i = 0, k = 4;
        // while (i < k) {

        //     prev.next = temp;
        //     temp = prev;
        //     temp.next.next.next = null;
        //     prev = temp.next.next;
        //     i++;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
    }
    public static void main(String[] args) {
        zigzag_LL ll=new zigzag_LL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        
    }
}
