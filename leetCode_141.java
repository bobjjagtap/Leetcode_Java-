public class leetCode_141 {
    Node head;
    public class Node{
        Node next;
        int data;
        Node(int n){
            next=null;
            data=n;
        }
    }
     public boolean isCycle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {
       
    }
}
