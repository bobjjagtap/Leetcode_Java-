import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class leetCode_235 {
    static class Node{
        Node right;
        Node left;
        int data;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        
    }
    static Queue<Node> q=new LinkedList<>();
    static ArrayList<Node> list=new ArrayList<>();
    public static void add(Node root) {
        if(root==null){
            return;
        }
        q.add(root);
         list.add(root);
         add(root.left);
         add(root.left);

    }
    public static void main(String[] args) {
        Node root=new Node(6);
        root.left=new Node(2);
        root.right=new Node(8);
        root.left.left=new Node(0);
        root.left.right=new Node(4);
        root.right.left=new Node(7);
        root.right.right=new Node(9);
        
        System.out.println(lowestCommonAncestor(root,new Node(2),new Node(8)).data);
        // add(root);
        // System.out.println(q.size()+"  "+list.size());
    }
}