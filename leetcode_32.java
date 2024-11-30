import java.util.Stack;

public class leetcode_32 {
    public static void parantesisss(String parantesis) {
        Stack<Character>s=new Stack<>();
          int i=0;
          int count=0;
          int sum=0;
        while(i<parantesis.length()){
            if('('==parantesis.charAt(i)){
                s.push(parantesis.charAt(i));
            }else if(')'==parantesis.charAt(i)&&!s.isEmpty()){
                count+=2;
                s.pop();
            }else if(')'==parantesis.charAt(i) && s.isEmpty()){
                   sum=Math.max(sum, count);
                   count=0;
            }
            i++;
        }sum=Math.max(sum, count);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String parantesis="()()(()";
        parantesisss(parantesis);
    }
}
