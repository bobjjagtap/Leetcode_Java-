public class leetCode_98{
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
    public boolean preorder(Node root) {
        if (root == null) {
            return false;
        }

        if(root.data <root.left.data && root.data> root.right.data){
            return false;
        }
        preorder(root.left);
        preorder(root.right);
        return true;
    }

public static void main(String[] args) {
    leetCode_98 lc=new leetCode_98();
    int nums[]={5,1,4,-1,-1,3,6,-1,-1,-1,-1};
    Node root=lc.BinaryTree(nums);
   // System.out.println(root.left.data);
    //System.out.println(root.right.data);
    System.out.println(lc.preorder(root));
}
}