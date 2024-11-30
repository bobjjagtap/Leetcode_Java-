public class leetCode_203 {
    Node head;
    Node tail;

    public class Node {
        Node next;
        int val;

        Node(int n) {
            next = null;
            val = n;
        }
    }

    public void add(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void removeElements(int v) {
        Node temp = head;
        if(head==null){
            return;
        }
        while (temp.next!= null) {
          if (temp.next.val == v) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }if(head.val==v){
                head = head.next;
        }

    }

    public void print() {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        leetCode_203 lc = new leetCode_203();
        lc.add(1);
        lc.add(1);
        lc.add(1);
        lc.add(1);
       // lc.add(8);
        lc.removeElements(1);
        lc.print();
    }
}
