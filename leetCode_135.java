public class leetCode_135 {
    public int candy(int[] rating) {
        int candy = 1;
        int n[] = new int[rating.length];
        int ans = 0;
        for (int i = 0; i < rating.length; i++) {
            if (i == 0) {
                n[i] = 1;
                //ans = 1;
            } else if (rating[i - 1] < rating[i]) {
                n[i] = n[i-1]+1;
            } else {
                if (n[i-1] == 1) {
                    n[i] = 1;                 // [4,2,3,5,2]
                    //ans += 1;
                } else {
                    n[i]=n[i-1]-1;
                    //ans += ans--;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            ans+=n[i];
            System.out.print(n[i]+" ");
        }
        return ans;
    }

    public static void main(String[] args) {
        leetCode_135 lc = new leetCode_135();
        int rating[] = { 1,0,2 };
        System.out.print(lc.candy(rating));
    }
}
