public class factoriall {
    public static int factorial(int n) {
        int a = 1;
        for (int i = n; i >= 1; i--) {
            a = a * i;
            
        }
        return a;
    }

    /*public static int boinomial(int n) {
        int q = factorial(n);
        int w = factorial(r);
        int e = factorial(n - r);
        int boinomial = q / (w * e);
        return boinomial;

    }*/

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(2));
    }
}