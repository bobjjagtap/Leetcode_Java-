public class leetCode_201 {
    public static int rangeBitwiseAnd(int left, int right){
        while(right>left){
            right=right & right-1;
            System.out.println(right);
        }
        return left&right; 
    }

    public static void main(String[] args) {
        int left=5;
        int right=7;
        System.out.println(rangeBitwiseAnd(left,right));
    }
}
