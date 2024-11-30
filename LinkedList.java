
public class LinkedList {
    static Node head;
    static Node head1;
    static Node tail1;
    static Node tail;
    int size;

    public static class Node {
        int str;
        Node next;

        Node(int s) {
            str = s;
            next = null;

        }
    }

    public void addFirst(int o) {
        Node newnode = new Node(o);
        size++;
        if (head1 == null) {
            head1 = tail1 = newnode;
            return;
        }
        newnode.next = head1;
        head1 = newnode;
    }

    public int removeFirst() {
        if (size == 1) {
            int val = head.str;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.str;
        head = head.next;
        size--;
        return val;

    }

    public void addLast(int b) {
        Node newnode = new Node(b);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        Node perv = head;
        for (int i = 0; i < size - 2; i++) {
            perv = perv.next;
        }
        int val = perv.next.str;
        tail = perv;
        tail.next = null;
        size--;
        return val;

    }

    public void add(int index, int p) {
        if (index == 0) {
            addFirst(p);
            return;
        }
        Node newnode = new Node(p);
        size++;
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int findd(int n) {
        int i;
        Node key = head;
        for (i = 0; i < size; i++) {
            if (n == key.str) {
                return i;
            }
            key = key.next;
        }
        return -1;

    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.str + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void revers() {
        int temp = head.str;
        head.str = tail.str;
        tail.str = temp;

    }

    public void removeNth(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        int i = 1;
        if (n == i) {
            head = head.next;
        }
        Node prev = head;
        while (prev != null) {
            if (i == n - 1) {
                prev.next = prev.next.next;
                break;
            } else {
                prev = prev.next;
            }
            i++;
        }
        return;

    }

    public void reverse() {
       
        Node prve = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prve;
            prve = current;
            current = next;
        }
        head=prve;
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

    public Node RemoveCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        Node prev = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return head;
        }
        slow = head;
        while (slow != fast) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(2);
        //list.print();
        list.reverse();

    }
}
