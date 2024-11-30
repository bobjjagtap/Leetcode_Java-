import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

import org.w3c.dom.Node;

public class BT_Ancestor {
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

    public static boolean check(Node root,ArrayList<Node>list,int n) {
        if(root==null){ 
        return false;
        }

        list.add(root);

        if(n==root.data){
        return true;
        }
        boolean fountleft=check(root.left, list, n);
        boolean fountright=check(root.right, list, n);

        if(fountleft||fountright){
            return true;
        }
        list.remove(list.size()-1);
        return false;

    }
    public static int Ancestor(Node root,int a,int b) {
        ArrayList<Node>list1=new ArrayList<>();
        ArrayList<Node>list2=new ArrayList<>();

        check(root,list1,a);
        check(root,list2,b);
        int i = 0;
        for (; i < list1.size() && i<list2.size(); i++) {
            if(list1.get(i)!=list2.get(i)){
                break;
            }
        }
        Node lca=list1.get(i-1);

        return lca.data;
       
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(Ancestor(root, 4, 5));
    }
}
