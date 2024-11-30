public class subtree {
    public static class Node {
        Node right;
        Node left;
        int data;

        Node(int data) {
            this.right = null;
            this.left = null;
            this.data = data;
        }
    }

    static int id = -1;

    public  Node add(int[] nums) {
        id++;
        if (nums[id] == -1) {
            return null;
        }

        Node newnode = new Node(nums[id]);
        newnode.left = add(nums);
        newnode.right = add(nums);

        return newnode;
    }
    public static boolean isIdentical(Node root,Node subtree) {
        if(root==null && subtree==null){
            return true;
        }
        if(root==null || subtree==null || root.data!=subtree.data){
            return false;
        }
        if(!isIdentical(root.left, subtree.left)){
            return false;
        }
        if(!isIdentical(root.right, subtree.right)){
            return false;
        }
        return true;
    }
    public static boolean issubTree(Node root,Node sub_tree) {
        if(root==null){
            return false;
        }
        if(root.data==sub_tree.data){
            if(isIdentical(root,sub_tree)){
            return true;
            }
        }
        return issubTree(root.left, sub_tree)|| issubTree(root.right, sub_tree);

    }
    public static void main(String[] args) {
        subtree sb=new subtree();
        int nums[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = sb.add(nums);
        Node subtree=new Node(2);
        subtree.left=new Node(4);
        subtree.right=new Node(5);
        System.out.println(sb.issubTree(root, subtree));
    }
}
