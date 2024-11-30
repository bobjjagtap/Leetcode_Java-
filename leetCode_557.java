public class leetCode_557 {
    public static String reverseWords(String s) {
        String word[]=s.split("\\s+");
        StringBuilder reversed=new StringBuilder();
        for (String str : word) {
            StringBuilder reversedWord=new StringBuilder(str);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");   
        }
        return reversed.toString().trim();
        s.substring(0, 0)
    }
    public static void main(String[] args) {
        String s="jayesh prashant jagtap";
        System.out.println(reverseWords(s));
    }
}
// s+=" ";
//         String str="";
//         Stack<Character>s1=new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             if(s.charAt(i)!=' ')s1.push(s.charAt(i));
//             else{
//                 while(!s1.isEmpty()){
//                     str+=Character.toString(s1.pop());
//                 }
//                 str+=Character.toString(s.charAt(i));
//             }

//         }
//         return str.trim();