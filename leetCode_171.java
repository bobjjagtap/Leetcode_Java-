public class leetCode_171 {
    public static int titleToNumber(String columnTitle) {
        int result=0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result=0;
            result*=26;
            result+=columnTitle.charAt(i)-'A'+1;
            System.out.println(result);
            
        }
        return result;
    }
    public static void main(String[] args) {
        String columnTitle="C";
        System.out.println(titleToNumber(columnTitle));
    }
}
