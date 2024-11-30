public class power_recursion {
    public static double powerr(double p) {
        double a=2.1;
        if(p==0){
        return 1;
        }
       //System.out.println("div is"+p/2);
        double sum=powerr(p/2);
       // System.out.println("actual value is = "+sum);
        sum=sum*sum;
        //System.out.println("sum is"+sum);
        //System.out.println("p is"+p);
         if(p % 2 !=0){
            //System.out.println(p);
             sum= a*sum;
             //System.out.println("hu"+sum);
         }
         System.out.println("----------------------");
         return sum;

        
    }
    public static void main(String[] args) {
        
        double p=3;

        System.out.println(powerr(p));
    }
    
}
