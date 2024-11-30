public class Build_BST {
    static class Node{
        Node right;
        Node left;
        int data;
        Node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }
    public static Node build_bts(Node root,int val) {
        if(root==null){
            Node newroot=new Node(val);
            return newroot;
        }
        if(root.data>val){
            root.left=build_bts(root.left, val);
        }else{
           root.right= build_bts(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder( root.right);
        return;
    }
    public static void main(String[] args) {
        int nums[]={5,1,3,4,2,7};
        Node root=null;
        for (int i = 0; i < nums.length; i++) {
            root=build_bts(root,nums[i]);
        }
        inorder(root);
    }
}
