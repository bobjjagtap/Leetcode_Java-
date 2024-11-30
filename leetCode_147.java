public class leetCode_147 {
    Node head;
    Node tail;
    int size = 0;

    public class Node {
        int data;
        Node next;

        Node(int n) {
            next = null;
            data = n;
        }
    }

    public void addLast(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void insertionSortList() {
        Node temp = head;
        Node temp1 = head.next;
        Node prev=head;
        while(temp1!=null)
        {
            if(temp.data>temp1.data){   
                prev=temp;
                addd(temp1.data);
                prev.next=prev.next.next;
        }
        temp=temp.next;
        temp1=temp1.next;
    }
    }
    public void addd(int n){
        Node newnode=new Node(n);
        Node temp=head;
        Node perv=null;
        while(temp!=null){
            if(temp.data<n){
                perv=temp;
                temp=temp.next;
            }else{
                perv.next=newnode;
                perv=newnode;
                break;
            }
        }
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        leetCode_147 lc = new leetCode_147();
        lc.addLast(-1);
        lc.addLast(5);
        lc.addLast(3);
        lc.addLast(4);
        lc.addLast(0);
        lc.addLast(5);
        lc.insertionSortList();
        lc.print();
    }
}
// for(int i=0;i< size-1;i++) {
//             if (temp.data > temp.next.data) {
//                 if(finall==null){
//                     finall=tail=temp;
//                 }else if(finall.data>=temp.data){
//                     int n=temp.data;
//                     temp=temp.next.next;
//                     for (int j = 0; j < size; j++) {
//                         Node newnode=new Node(n);
//                         Node prev=null;
//                         if(temp2.data<=newnode.data){
//                             prev=temp2;
//                             temp2=temp2.next;
//                         }else{
                            
//                         }
//                     }
//                 }
//             }
// Node temp2=head.next;
//             Node prev2=head;
//             while(temp2!=null){
//                 if(temp2.data<=prev.data){

//                 }
//             }
//             temp = temp.next;
