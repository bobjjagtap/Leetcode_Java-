import java.util.*;
public class BTNth_level {
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
   static ArrayList<Integer>List=new ArrayList<>();
public static ArrayList<Integer> Kth_level(Node root,int k,int level) {
    if(root==null){
        return List; 
    }
    if(level==k){
        List.add(root.data);
        return List;
    }
    Kth_level(root.left, k, level+1);
    Kth_level(root.right, k, level+1);
    return List;
}
    public static void main(String[] args) {
        BTNth_level bt=new BTNth_level();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        System.out.println(bt.Kth_level(root,3,1));
    }
}
