public class leetcode_50 {
    private static double findd(int n,double x) {
        if(n<0){
            n=-n;
            x=1/x;
        }
        double pow =1; 
        while(n!=0){
            if((n & 1)!=0){
                pow*=x;
            }
            x*=x;
            n>>>=1;
        }
        return pow;
        
    }
    public static void main(String[] args) {
        int n=-7;
        double x=9;//9^7
        System.out.println(findd(n,x));
    }
    
}
