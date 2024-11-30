import java.util.LinkedList;
import java.util.Queue;

public class Level_order {
    static class Node{
        Node right;
        Node left;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=right;
        }
    }static int id=-1;
    public Node binaryTree(int[] nums) {
        id++;
        if(nums[id]==-1){
            return null;
        }
        Node newnode=new Node(nums[id]);
        newnode.left=binaryTree(nums);
        newnode.right=binaryTree(nums);
        return newnode;
    }
    public void levelOrder(Node root) {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node current=q.remove();
            if(current==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }else{
                System.out.print(current.data+" ");
                if(current.left!=null){
                    q.add(current.left);
                }if(current.right!=null){
                    q.add(current.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Level_order lo=new Level_order();
        int nums[]={1, 2, 4,  -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root=lo.binaryTree(nums);
        lo.levelOrder(root);
    }
}
