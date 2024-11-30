import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class leetCode_30 {
    public void findSubstring(String s, String[] words) {
        int n=s.length()/3;
        int m=words.length;
        Arrays.sort(words);
        List<String> list=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        List<Integer> listfinal=new ArrayList<>();
        System.out.println(n);
            for (int j = 0; j <s.length() ; j=j+3) {
                list.add(s.substring(j, j+3));
            }
            System.out.println(list);
            for (int i = 0; i < list.size()-1; i++) {
                
                for (int j = i; j <m+i ; j++) {
                          list2.add(list.get(j));
                          int a=0;
                          int l=0;
                          if(j==(m+i)-1){
                            Collections.sort(list2);
                            //System.out.println("list2 id=s "+list2);
                           chack(list2,words,listfinal);
                            list2.removeAll(list2);
                            System.out.println("wdedwd=="+list2);
                          }
                }

            }
            System.out.println(listfinal);
    }
    public void chack(List<String> list2,String words[],List<Integer> listfinal){
        int a=0;
        int i=0;
        while(a<2){
            String s=list2.get(a);
            System.out.println(s);
            System.out.println(words[a]);
            
            a++;
        }
        i++;
    }
    public static void main(String[] args) {
        leetCode_30 lc=new leetCode_30();
        String s = "barfoothefoobarman"; 
        String words[] = {"foo","bar"};
        lc.findSubstring(s,words);
    }
}
 