import javax.swing.tree.TreeNode;

public class leetCode_100 {
    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int data) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null || q==null||p.val!=q.val){
            return false;
        }
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
