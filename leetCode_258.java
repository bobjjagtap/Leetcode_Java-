public class leetCode_258 {
    public static int addDigits(int num) {
        while(num>9){
            num=check(num);
        }
        return num;
    }
    public static int check(int nums) {
        int sum=0;
        while(nums!=0){
            sum+=nums%10;
            nums/=10;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println(addDigits(num));
    }
}
