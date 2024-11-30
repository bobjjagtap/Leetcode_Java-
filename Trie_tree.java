public class Trie_tree {
    static class Node{
        Node next[]=new Node[26];
        boolean eow=false;

        Node(){
            for (int i = 0; i < 26; i++) {
                next[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(curr.next[index]==null){
                curr.next[index]=new Node();
               
            }
             curr=curr.next[index];
           // System.out.println("current Node  "+curr);
        }
        
        curr.eow=true;
    }

    public static boolean search(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(curr.next[index]==null){
                return false;
            }
             curr=curr.next[index];
        }
        return curr.eow==true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for (int i = 1; i <=key.length(); i++) {
            if(search(key.substring(0, i)) 
            && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[]={"i","like","sam","ice"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
String str="ilikesamsung";
        System.out.println(wordBreak(str));
    }
}
