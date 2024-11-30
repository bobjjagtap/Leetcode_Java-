public class leetCode_1071 {
    public static String gcdOfStrings(String str1, String str2) {
        int n=0;
        if(str1.length()<str2.length()){
            n=str2.length();
        }else{
            n=str1.length();
        }
        String fin="";
        String s1="";
        String s2="";
        for (int i = 1; i <= str1.length()/2; i++) {
            int counnt=0;
            for (int j = 0; j <= str1.length(); j+=i) {
                s1=str1.substring(j, j+i);s2=str2.substring(0, i);

                if(s1.equals(s2)){
                    if(counnt>=1)
                        fin=str1.substring(j, j+i);
                    counnt++;
                }else{
                    break;
                }
                
            }
        }
        return fin;
    }
    public static void main(String[] args) {
        String str1="ABABABABABABABABAB", str2="ABAB";
        //str1=str1.substring(0, 3);str2=str2.substring(0, 3);
       System.out.println(gcdOfStrings(str1,str2));
    }
}
