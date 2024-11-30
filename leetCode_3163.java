public class leetCode_3163{
    public static void main(String[] args) {
        String word="aaaaaaaaaaaaaabb";
        StringBuilder comp=new StringBuilder();
        int cnt=1;
        char ch=word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if(ch==word.charAt(i) && cnt<9){
                cnt++;
            }else{
                comp.append(cnt).append(ch);
                ch=word.charAt(i);
                cnt=1;
            }
        }
        comp.append(cnt).append(ch);
        System.out.println(comp);

    }
}