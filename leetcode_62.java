public class leetcode_62 {
    public static int shortway(int n,int m) {
        int temp[][]=new int[n][m];
        for(int i=0;i<temp.length;i++){
            temp[i][0]=1;
        }
        for(int i=0;i<temp[0].length;i++){
            temp[0][i]=1;
        }
        for(int i=1;i<temp.length;i++){
            for(int j=1;j<temp[0].length;j++){
                //System.out.print(temp[i][j]);
                 temp[i][j]=temp[i-1][j]+temp[i][j-1];

            }
            System.out.println();
        }

        return temp[n-1][m-1];
    }
    public static void main(String[] args) {
       int n=3,m=7;
       System.out.print(shortway(n,m));
    }
}
