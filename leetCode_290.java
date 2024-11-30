import java.util.HashMap;
import java.util.HashSet;

public class leetCode_290 {
    public static boolean wordPattern(String pattern, String s) {
        String words[]=s.split("\\s");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String>map1=new HashMap<>();
        HashMap<String,Character>map2=new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c=pattern.charAt(i);
            String word=words[i];
            if(!map1.containsKey(c))
            map1.put(c, word);

            if(!map2.containsKey(word))
            map2.put(word,c);

            if(!map1.get(c).equals(word) || !map2.get(word).equals(c)){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
    String pattern="aaaa",s="dog cat cat dog"; 
    System.out.println(wordPattern(pattern, s));
}
}
