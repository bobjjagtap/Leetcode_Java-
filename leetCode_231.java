public class leetCode_231 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int n=1073741824/2;
        System.out.println(isPowerOfTwo(n));

        // for (int i = 0; i < 32; i++) {
            
        //         if(Math.pow(2, i)==n){
        //             System.out.println("suc");
        //         }
        // }
        
    }
}
