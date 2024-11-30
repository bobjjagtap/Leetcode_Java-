public class leetCode_279 {
    public static void main(String[] args) {
        int n=3;
        int m=0;
        while(n!=0){
            int j=(int)Math.sqrt(n);
            n-=Math.pow(j, 2);
            m++;
        }
        System.out.println(m);

    }
}
/*
 324
 16
 4
 */