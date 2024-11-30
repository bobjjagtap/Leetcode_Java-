public class search_BST {
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
    public static boolean search(Node root,int val) {
        if(root==null){
            return false;
        }
        if(val==root.data){
            return true;
        }
        if(root.data>val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }
    
    public static void main(String[] args) {
        int nums[]={5,1,3,4,2,7};
        Node root=null;
        for (int i = 0; i < nums.length; i++) {
            root=build_bts(root,nums[i]);
        }
       
        if(search(root,9))
        {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
