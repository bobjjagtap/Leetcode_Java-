import java.util.ArrayList;
import java.util.List;

public class leetcode_17 {
 
    public List<String> solvee(String digits) {
         List<String> list = new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
       
         String dial[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

       backtrack("",digits,list,dial);
       return list;
    }
       public void backtrack(String result,String digits,List<String>list,String dial[]){
        if(digits.isEmpty()){
            list.add(result);
            return;
        }else{
        String word=dial[digits.charAt(0)-'2'];
        for(char cha : word.toCharArray()){
            System.out.println(cha);
        backtrack(result+cha,digits.substring(1), list, dial);
        
        }
        System.out.println("next line");
        }
      
    }

    public static void main(String[] args) {
        leetcode_17 ll = new leetcode_17();
        String digits = "23";
        System.out.println(ll.solvee(digits));
    }
}
// for (int j1 = j + 1; j1 < list2.size(); j1++) {
// for (int j2 = 0; j2 < list2.get(j).length(); j2++) {
// for (int j3 = 0; j3 < list2.get(j1).length(); j3++) {
// String a=Character.toString(list2.get(j).charAt(j2));
// a+=Character.toString(list2.get(j1).charAt(j3));
// list.add(a);

// }
// }
// }