public class detectingCycle_LL {
     static Node head;
    static Node tail;
        public static class Node{
             Node next;
            int data;
            Node(int n){
                data=n;
                next=null;
            }
        }
        public static boolean isCycle() {
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;

        }
        public static void main(String[] args) {
            detectingCycle_LL lc=new detectingCycle_LL();
            head=new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=new Node(4);
            head.next.next.next.next=new Node(6);
            System.out.println(lc.isCycle());
        }
}
