import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public class leetCode_257 {
    static class TreeNode{
        TreeNode right;
        TreeNode left;
        int val;
        TreeNode(int data){
            this.left=null;
            this.right=null;
            this.val=data;
        }
    }
    static ArrayList<String>list=new ArrayList<>();
    public static List<String> binaryTreePaths(TreeNode root) {
        check(root,list,"");
        return list;
    }
    public static void check(TreeNode root,ArrayList<String>list,String str) {
        if(root==null){
            return;
        }
        str+=root.val+"->";
        check(root.left,list,str);
        check(root.right,list,str);
        if(root.right==null && root.left==null){
            list.add(str.substring(0,str.length()-2));
        }
        return;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.println(binaryTreePaths(root));
    }
}
