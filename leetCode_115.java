public class leetCode_115 {
    public int numDistinct(String s, String t){
        int map[][]=new int[t.length()+1][s.length()+1];
        for (int i = 0; i <=s.length(); i++) {
            map[0][i]=1;
        }
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)==t.charAt(i)){
                    map[i+1][j+1]=map[i][j]+map[i+1][j];
                }else{
                    map[i+1][j+1]=map[i+1][j];
                }
                
            }
        }
        return map[t.length()][s.length()];
    }
    public static void main(String[] args) {
        leetCode_115 lc=new leetCode_115();
        String s="rabbbit";
        String t="rabit";
        System.out.println(lc.numDistinct(s,t));
    }
}
