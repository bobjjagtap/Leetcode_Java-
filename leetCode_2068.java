import java.util.HashMap;

public class leetCode_2068 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int array1[]=new int[26];
        int array2[]=new int[26];
        for (int i = 0; i < word1.length(); i++) {
            array1[word1.charAt(i)-'a']=array1[word1.charAt(i)-'a']+1;
            array2[word2.charAt(i)-'a']=array2[word2.charAt(i)-'a']+1;
        }
        for (int i = 0; i < array2.length; i++) {
            int value=Math.abs(array1[i]-array2[i]);
            if(value>3){
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args) {
        leetCode_2068 lc=new leetCode_2068();
        String word1 = "abcdeef", word2 = "abaaacc";
        System.out.println(lc.checkAlmostEquivalent(word1, word2));
    }
}




// HashMap<Character,Integer>map1=new HashMap<>();
// HashMap<Character,Integer>map2=new HashMap<>();
// for (int i = 0; i < word2.length(); i++) {
//  if (map1.containsKey(word1.charAt(i))) {
//      map1.put(word1.charAt(i), map1.get(word1.charAt(i))+1);
//  }else{
//      map1.put(word1.charAt(i), 1);
//  }
//  if (map2.containsKey(word2.charAt(i))) {
//      map2.put(word2.charAt(i), map2.get(word2.charAt(i))+1);
//  }else{
//      map2.put(word2.charAt(i), 1);
//  }
// }
// System.out.println(map1);
// System.out.println(map2);