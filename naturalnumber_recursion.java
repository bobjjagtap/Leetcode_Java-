public class naturalnumber_recursion {
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int sumw=n+sum(n-1);
        return sumw;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
