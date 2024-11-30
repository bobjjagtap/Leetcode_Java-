import javax.swing.tree.TreeNode;

public class leetCode_226 {
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
    }
     public static TreeNode invertTree(Node root) {
        if(root==null){
            return root;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
    public static void main(String[] args) {
         leetCode_226 r=new leetCode_226();
            int nums[]={4,2,7,1,3,6,9,-1,-1,-1,-1,-1,-1,-1,-1};
          Node root=r.BinaryTree(nums);
          System.out.println(invertTree(root));
    }
}
