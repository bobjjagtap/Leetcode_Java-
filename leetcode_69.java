public class leetcode_69 {
    public static int findd(int n) {
        int start=1;
       int end=n;
       if(n==0)return n;
       if(n==1)return n;
       while(start<=end){
        int mid=(start+end)/2;
        if(mid*mid > n){
            end=mid-1;
        }
        else if(mid*mid==n){
            return mid;
        }
        else{
            start=mid+1;
        }
       }
       return end;
    }
    public static void main(String[] args) {
        int n=50;
       System.out.println(findd(n));
    }
}
