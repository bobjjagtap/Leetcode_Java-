import java.util.Arrays;
public class practice_leet {
    public static void main(String[] args) {
        String words[] = {"abcw","baz","foo","bar","xtfn","abcdef"};
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+"->");
        }
    }
}
