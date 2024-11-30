public class leetCode_237 {
    public void deleteNode(Node node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        
    }
}
