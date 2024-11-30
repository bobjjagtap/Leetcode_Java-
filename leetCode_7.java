public class leetCode_7 {
    public static int findd(int x) {
        long finall=0;
        while(x!=0){
            int las=x%10;
            finall+=las;
            finall=finall*10;
            x=x/10;
        }
        finall=finall/10;
        if(finall>Integer.MAX_VALUE || finall<Integer.MIN_VALUE){
            return 0;
        }
        return (int)finall;
    }
    
    public static void main(String[] args) {
        int n= 1534236469;
       System.out.println( findd(n));
    }
}
