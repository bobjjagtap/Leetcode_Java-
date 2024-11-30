public class RemoveingCycle_LL {
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
        public static Node RemoveCycle(){
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            Node prev=null;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    cycle=true;
                    break;
                }
            }
            if(cycle==false){
                return head;
            }
            slow=head;
                    while(slow!=fast){
                        prev=fast;
                        fast=fast.next;
                        slow=slow.next;
                    }
                    prev.next=null; 
                    return head;   
        }
        public static void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        public static void main(String[] args) {
           
            head=new Node(1);
            Node temp=new Node(2);
            head.next=temp;
            head.next.next=new Node(3);
            head.next.next.next=temp;
            RemoveCycle();
            print();
        }
}
