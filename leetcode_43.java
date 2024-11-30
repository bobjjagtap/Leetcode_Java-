import java.math.BigInteger;

public class leetcode_43 {
    public static String multi(String num1, String num2) {
         BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger mult;
        mult = a.multiply(b);
        num1 = mult.toString();

        return num1;
    }

    public static void main(String[] args) {
        String num1 = "4912345678912345678900", num2 = "841234567890123456787645453432";
        System.out.println(multi(num1, num2));
    }

}
// long sum1=0,sum2=0;
// for (int i = 0; i < num1.length(); i++) {
// sum1=sum1*10+((long)num1.charAt(i)-48);

// }
// for (int i = 0; i < num2.length(); i++) {
// sum2=sum2*10+((long)num2.charAt(i)-48);
// }
// System.out.println(sum1);
// System.out.println(sum2);
// System.out.println(sum1*=sum2);

// num1=Long.toString(sum1);
