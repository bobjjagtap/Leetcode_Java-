public class leetCode_606{
    public static class Node {
        Node right;
        Node left;
        int data;

        Node(int data) {
            this.right = null;
            this.left = null;
            this.data = data;
        }
    }

    static int id = -1;

    public  Node add(int[] nums) {
        id++;
        if (nums[id] == -1) {
            return null;
        }

        Node newnode = new Node(nums[id]);
        newnode.left = add(nums);
        newnode.right = add(nums);

        return newnode;
    }
public static void main(String[] args) {
    leetCode_606 lc=new leetCode_606();
    int [] linklist={1,2,3,4,-1,-1,-1};
    Node root=lc.add(linklist);
}
}