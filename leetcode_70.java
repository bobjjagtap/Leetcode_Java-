 public class leetcode_70{
    public static int findd(int n) {
        
    if(n==1) return 1; 
        if(n==2) return 2;
        if(n==3)return 3;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
public static void main(String[] args) {
    int n=3;
    System.out.println(findd(n));
}}