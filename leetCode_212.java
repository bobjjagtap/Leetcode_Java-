import java.util.ArrayList;

public class leetCode_212 {
    public static void findWords(String[][] str,String[] words) {
        ArrayList<String>s=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            check(words[i],str);
        }
    }
    public static void check(String word,String[][] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                
            }
            for (int j =str.length-1; j>=0;j--) {
                
            }
            for (int j = 0,; j < str.length; j++) {
                
            }
        }
    }
    public static void main(String[] args) {
        String str[][]={{"o","a","a","n"},
                        {"e","t","a","e"},
                        {"i","h","k","r"},
                        {"i","f","l","v"}};

        String words[]={"oath","pea","eat","rain"};
    }
}
