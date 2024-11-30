import java.util.*;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class leetCode_23 {

    public static class ListNode {
        ListNode next;
        int data;

        ListNode(int n) {
            data = n;
            next = null;
        }
    }

    public ListNode addLast(List<Integer> list) {
        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < list.size(); i++) {
            ListNode newnode = new ListNode(list.get(i));
            if (head == null) {
                head = tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }

        }
        return head;

    }

    public void mearge(ListNode[] arr) {
        ListNode temp = null;
        // ListNode head=null;

        List<Integer> list = new ArrayList<>();
        for (ListNode node : arr) {
            temp = node;
            while (temp != null) {
                list.add(temp.data);
                temp = temp.next;
            }
        }
        Collections.sort(list);

        ListNode fil = addLast(list);
        print(fil);
    }
     public void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        leetCode_23 lc = new leetCode_23();
        int k = 3;
        ListNode[] arr = new ListNode[k];

        arr[0] = new ListNode(1);
        arr[0].next = new ListNode(4);
        arr[0].next.next = new ListNode(5);
        // arr[0].next.next.next = new Node(7);

        arr[1] = new ListNode(1);
        arr[1].next = new ListNode(3);
        arr[1].next.next = new ListNode(4);
        // arr[1].next.next.next = new Node(8);

        arr[2] = new ListNode(2);
        arr[2].next = new ListNode(6);
        // arr[2].next.next = new Node(10);
        // arr[2].next.next.next = new Node(11);
        lc.mearge(arr);

    }
}

// int nums[][] = { { 1, 4, 5 }, { 1, 3, 5 }, { 2, 6 } };

// List<Integer> list = new ArrayList<>();
// for (int[] s : nums) {
// for (int j = 0; j < s.length; j++) {
// list.add(s[j]);
// }
// }

// Collections.sort(list);
// System.out.println(list);
// for (int i = 0; i < list.size(); i++) {
// int n = list.get(i);
// lc.addLast(n);

// }
// lc.print();
// --------------------------------------------------------
// import java.util.*;
// import java.util.LinkedList;
// public class leetCode_23 {
// static Node head;
// static Node tail;

// public static class Node {
// Node next;
// int data;

// Node(int n) {
// data = n;
// next = null;
// }
// }
// public static void addLast(int b) {
// Node newnode = new Node(b);
// if (head == null) {
// head = tail = newnode;
// return;
// }
// tail.next = newnode;
// tail = newnode;
// }
// public static void mearge( Node[] arr ){
// Node temp=null;
// List<Integer> list=new ArrayList<>();
// for (Node node : arr) {
// temp=node;
// while(temp!=null){
// list.add(temp.data);
// temp=temp.next;
// }
// }
// Collections.sort(list);
// for (int i = 0; i < list.size(); i++) {

// int n=list.get(i);
// addLast(n);
// }

// }

// public static void print() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + "->");
// current = current.next;
// }
// System.out.println();
// }

// public static void main(String[] args) {

// int k=3;
// Node[] arr = new Node[k];

// arr[0] = new Node(1);
// arr[0].next = new Node(4);
// arr[0].next.next = new Node(5);
// //arr[0].next.next.next = new Node(7);

// arr[1] = new Node(1);
// arr[1].next = new Node(3);
// arr[1].next.next = new Node(4);
// // arr[1].next.next.next = new Node(8);

// arr[2] = new Node(2);
// arr[2].next = new Node(6);
// // arr[2].next.next = new Node(10);
// // arr[2].next.next.next = new Node(11);
// mearge(arr);
// print();
// }
// }
