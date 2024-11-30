public class leetCode_166 {
    public static String fractionToDecimal(int numerator, int denominator){
      String sum="";
        return sum=Float.toString((float)numerator/denominator);
    }
    public static void main(String[] args) {
        int numerator =4, denominator=333;
        System.out.println(fractionToDecimal(numerator,denominator));
    }
}
