import java.util.ArrayList;

public class leetCode_140 {
    public static ArrayList<String> wordBreak(String s,String[] wordDict) {
        ArrayList<String>List=new ArrayList<>(null);
        for (int i = 0; i < wordDict.length; i++) {
            List.add(wordDict[i]);
        }
        chack(List,s,wordDict,0,0,"");
        
    }
    public static void chack(ArrayList<String>List,String s,String[] wordDict,int i,int j,String d){
        
            for (int j2 = 0; j2 < wordDict[j].length(); j2++) {
                if(s.charAt(i)==wordDict[j].charAt(j2)){
                    i++;
                }else{
                    break;
                }
            }

        for (int j2 = 0; j2 < wordDict.length; j2++) {
            chack(List, s, wordDict, i, j+1, d);
        }
    }
    public static void main(String[] args) {
       //String s = "catsanddog";String[] wordDict = {"cat","cats","and","sand","dog"};
       String s = "pineapplepenapple"; String[] wordDict = {"apple","pen","applepen","pine","pineapple"};
       System.out.println( wordBreak(s,wordDict));
    }
}
