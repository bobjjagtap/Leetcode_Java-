import java.util.*;

public class leetCode_151 {
    public static String reverse(String s) {
        String str[]= s.trim().split("\\s+");
        s="";
        for (int i =str.length-1;i>=0; i--) {
            
            if(0!=i)s+=str[i]+" ";
           else s+=str[i];
        }
        return s;
    }
    public static void main(String[] args) {
        String str="a              good   example";
        System.out.println(reverse(str));
    }
}
// AAPL LOGIC
// s=s.trim();
//         String temp="";
//         int space_count=0;
//         Stack<String>s1=new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
            
//             if(s.charAt(i)==' '){
//                 ++space_count;
//                 if(space_count<2){
//                 s1.add(temp);
//                 }
//                 temp="";
                
//             }else{
//                 space_count=0;
//                 temp+=Character.toString(s.charAt(i));
//             }
            
//         }
//         s1.add(temp);
//         s="";
//         while(!s1.isEmpty()){
//             s+=s1.peek()+" ";
//             s1.pop();
//         }
//         return s.trim();