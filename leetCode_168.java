public class leetCode_168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder resultt=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c=(char)('A'+columnNumber%26);
            resultt.insert(0,c);
            columnNumber/=26;
        }
        
        return resultt.toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(100));
       
    }
}
