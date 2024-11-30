public class leetcode_67 {
    public static String addd(String a,String b) {
         StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) 
    {
      if(i >= 0)
        carry += a.charAt(i--) - '0';
        //System.out.print(carry);
      if(j >= 0)
        carry += b.charAt(j--) - '0';
        System.out.print(carry);
      sb.append(carry % 2);
      carry /= 2;
    }
    return sb.reverse().toString();
        
    }
    public static void main(String[] args) {
        String a="1010";
        String b="1010";
       System.out.println(addd(a,b));
    }
}
