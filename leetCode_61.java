public class leetCode_61 {
    static ListNode head;
    static ListNode tail;
    public static class ListNode {
        ListNode next;
        int val;

        ListNode(int n) {
            val = n;
            next = null;
        }
    }

    public void addLast(int b) {
        ListNode newnode = new ListNode(b);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }

    public ListNode rotate(ListNode head,int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode size=head;
        int sizee=0;
        while(size!=null){
            sizee++;
            size=size.next;
        }
        
        int l=0;
        if(k>=sizee){
            k=k%sizee;
        }if(k==0){
            return head;
        }
        while(l<k){
            ListNode temp=head;
        for (int i = 0; i < sizee-2; i++) {
            temp=temp.next;
        }
        int num=temp.next.val;
        size=temp;
        size.next=null;
       ListNode newnode = new ListNode(num);
        newnode.next = head;
        head = newnode;
        l++;
    }
    return head;
    }
    

    public static void main(String[] args) {
        leetCode_61 list = new leetCode_61();
        
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.rotate(head,2000000000);
        list.print();

    }
}
