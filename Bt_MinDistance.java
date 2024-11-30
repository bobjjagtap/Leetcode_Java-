import java.util.ArrayList;

public class Bt_MinDistance {
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
    public static int check(Node root,int n) {
        if(root==null){ 
        return -1;
        }

        
        if(n==root.data){
        return 0;
        }
        int rightdistance= check(root.left,  n);
        int leftdistance=check(root.right,  n);
        if(leftdistance==-1&&rightdistance==-1){
            return-1;
        }
        else if(leftdistance==-1){
            return rightdistance+1;
        }else{
            return leftdistance+1;
        }

    }
    public static int Ancestor(Node root,int a,int b) {
        int sum1=0;
        int sum2=0;

        sum1=check(root,a);
        sum2=check(root,b);

        return  sum2+sum1;
    }
    public static void main(String[] args) {
        
    

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        System.out.println(Ancestor(root,4,7));
    }
}
