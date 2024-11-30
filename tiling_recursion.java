public class tiling_recursion {
    public static int tiling(int n) {
        int j=0,h=0;
        if(n==0||n==1){
            return 7;
        }
       // System.out.println(j);
         j=tiling(n-1);
         System.out.println("number is"+n);
        System.out.println("j is"+j);
        //System.out.println(h);
         h=tiling(n-2);
       System.out.println("h is "+h);
        int sum=j+h;
        System.out.println("j sum h is "+sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
    
}
