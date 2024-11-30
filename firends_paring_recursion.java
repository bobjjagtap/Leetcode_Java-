public class firends_paring_recursion {
    public static int paring(int n) {
        if(n==1 || n==2){
            return n;
        }
        int fn1=paring(n-1);
        System.out.println("fn1 is "+fn1);
        int fn2=paring(n-2);
        System.out.println("fn2 is "+fn2);
        //System.out.println(n-1);
        int pairways=(n-1)*fn2;
       
       System.out.println("no of pair ways"+pairways);
         int totways=fn1+pairways;
         return totways;
        
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(paring(n));
    }
    
}
