public class leetcode_58 {
    public static void main(String[] args) {
        String s="hello World";
        s=s.trim();
        System.out.println(s);
        int n=0;
        for (int i =  s.length()-1; i >= 0; i--) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='A' && s.charAt(i)<='Z'){
                n++;
            }
            else{
                break;
            }
        }
        System.out.println(n);
    }
}
