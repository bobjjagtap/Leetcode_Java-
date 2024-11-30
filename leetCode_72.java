public class leetCode_72 {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=n;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=m;++i){
            for(int j=1;j<=n;++j){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        //return dp[m][n];
        // int m = word1.length();
        // int n = word2.length();
        // int dp[][] = new int[m + 1][n + 1];
        // for (int i = 1; i <= m; i++) {
        //     dp[i][0] = i;
        // }
        // for (int i = 1; i <= n; i++) {
        //     dp[0][i] = i;
        // }

        // for (int i = 1; i <= m; ++i)
        //     for (int j = 1; j <= n; ++j)
        //         if (word1.charAt(i - 1) == word2.charAt(j - 1))// same characters
        //             dp[i][j] = dp[i - 1][j - 1];// no operation
        //         else
        //             dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1; // replace //delete
        //                                                                                              // //insert

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
         return dp[m][n];
    }

    public static void main(String[] args) {
        leetCode_72 lc = new leetCode_72();
        //lc.minDistance("intention", "execution");
        System.out.println(lc.minDistance("horse", "ros"));
    }
}
