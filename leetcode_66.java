public class leetcode_66 {
    public static int[] plusone(int digits[]) {
        int i=digits.length-1;
         
        if(digits[i]!=9){
            digits[i]+=1;
        }else{
            while(i>=0 && digits[i]==9) {
                digits[i]=0;i--;
                if(digits[0]==0){
                    digits=new int[digits.length+1];
                    digits[0]=1;
                   // System.out.println(digits.length);
                    return digits;
                    }

                }
            digits[i--]+=1;

        }
        return digits;
    }
    public static void main(String[] args) {
        int digits[]={9,9,9,9,9};
        plusone(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }
}
