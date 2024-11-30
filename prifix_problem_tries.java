

public class prifix_problem_tries {

    public static class Node {
        Node child[] = new Node[26];
        boolean eow = false;
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insurt(String arr) {
        Node current = root;
        for (int i = 0; i < arr.length(); i++) {
            int n=arr.charAt(i)-'a';
            if(current.child[n]==null){
                current.child[n]=new Node(); 
            }else{
                current.child[n].freq++;
            }
            current=current.child[n];
        }
        current.eow=true;

    }
    public static void find_prifix(Node root,String ans) {
        if (root==null) {
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.child.length; i++) {
            if(root.child[i]!=null){
                find_prifix(root.child[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "zero", "duck", "dog", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insurt(arr[i]);
        }
        root.freq=-1;
        find_prifix(root, " ");
    }
}
