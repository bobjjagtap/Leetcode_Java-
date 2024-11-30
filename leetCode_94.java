import java.util.*;
import java.util.ArrayList;

import java.util.List;

import javax.swing.tree.TreeNode;

public class leetCode_94 {
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
    static int id=-1;
    public Node BinaryTree(int[] nums) {
        id++;

        if (nums[id] == -1) {
            return null;
        }
        Node newnode = new Node(nums[id]);
        newnode.left = BinaryTree(nums);
        newnode.right = BinaryTree(nums);

        return newnode;
    }
    public ArrayList<Integer> inorderTraversal(Node root) {
       ArrayList<Integer>list=new ArrayList<>();
        check(root,list);
        return list;
    }
    public void check(Node root,ArrayList<Integer>list) {
        if(root==null){
            return;
        }
        list.add(root.data);
        check(root.left,list);
        
        check(root.right,list);
    }

    public static void main(String[] args) {
        leetCode_94 lc=new leetCode_94();
        int nums[]={1,-1,2,3,-1,-1,-1};
        Node root=lc.BinaryTree(nums);
        System.out.println(root.data);
       
        System.out.println(lc.inorderTraversal(root));
        
    }
}
