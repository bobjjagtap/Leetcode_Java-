public class permutition {
    public static void findd(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cha=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            System.out.println(newstr);
            findd(newstr,ans+cha);   
        }
        
    }
    public static void main(String[] args) {
        String str="231";
        findd(str,"");
    }
}
