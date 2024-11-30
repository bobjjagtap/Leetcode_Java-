import java.util.LinkedList;
import java.util.Queue;

public class Binary_tree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        static int id = -1;

        public static Node BinaryTree(int[] nums) {
            id++;

            if (nums[id] == -1) {
                return null;
            }
            Node newnode = new Node(nums[id]);
            newnode.left = BinaryTree(nums);
            newnode.right = BinaryTree(nums);

            return newnode;
        }1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1

        public void preorder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        public void levelOrder(Node root) {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node current=q.remove();
            if(current==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }else{
                System.out.print(current.data+" ");
                
                if(current.left!=null){
                    q.add(current.left);
                }if(current.right!=null){
                    q.add(current.right);
                }
            }
        }
       
    }
    static int count=0;
    public int count(Node root) {
        if(root==null){
            return 0;
        }
        count(root.left);
        count(root.right);
        count+=1;
        return count;
    }
    static int summ=0;
    public int sum(Node root) {
        if(root==null){
            return 0;
        }
        sum(root.left);
        sum(root.right);

        summ+=root.data;
        return summ;
    }

    public static void main(String[] args) {
        Binary_tree bt = new Binary_tree();
        int nums[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = bt.BinaryTree(nums);
        // System.out.println(root.data);
        bt.preorder(root);
        System.out.println("PREORDER");

        bt.inorder(root);
        System.out.println("INORDER");

        bt.postorder(root);
        System.out.println("POSTORDER");

        System.out.println("LEVEL ORDER TRAVERS");
        bt.levelOrder(root);

        System.out.println("COUNT IS = "+ bt.count(root));

        System.out.println("SUM IS = "+ bt.sum(root));
    }
}
