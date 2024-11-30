public class fibonacci_recursion {
    public static void fibo(int a,int b,int n) {
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibo(b, c, n-1);//b=a; c=b; there will be swaping in this function
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibo(a, b, n);
    }
}
