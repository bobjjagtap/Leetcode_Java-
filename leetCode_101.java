import javax.swing.tree.TreeNode;

public class leetCode_101 {
    static class TreeNode {
        int data;
        TreeNode right;
        TreeNode left;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode right=root.right;
        TreeNode left=root.left;
        return check(left,right);
    }
    public boolean check(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if (left == null||right==null||left.data!=right.data) {
                return false;
            }
            

        return check(left.left,right.right)&&check(left.right,right.left);

    }
}
}
