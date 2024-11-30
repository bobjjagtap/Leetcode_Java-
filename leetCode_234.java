public class leetCode_234 {
    public class ListNode{
        ListNode head;
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
            this.head=head;
            this.next=null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int size=0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            size++;
        }
        System.out.print(size);
        ListNode current=slow;
        ListNode next;
        ListNode prve=null;
         while (current != null) {
            next = current.next;
            current.next = prve;
            prve = current;
            current = next;

        }
        ListNode cur=prve;
        while (cur != null) {
            if(cur.val!=head.val)return false;
            cur=cur.next;
            head=head.next;
        }
          return true;
    }
    public static void main(String[] args) {
        
    }
}
