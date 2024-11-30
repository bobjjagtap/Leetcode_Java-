public class leetcode_63 {
    public static int findways(int[][] obstacleGrid) {
        for(int i=0;i<obstacleGrid.length;i++){
            obstacleGrid[i][0]=1;
        }
        for(int i=1;i<obstacleGrid[0].length;i++){
            obstacleGrid[0][i]=1;
        }
       int k=1;
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
          if(obstacleGrid[i][j]!=k){
            obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
          }else{
            k++;
            obstacleGrid[i][j]=0;
            obstacleGrid[i][j+1]=1;
            obstacleGrid[i+1][j]=1;
           }
        }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
    public static void main(String[] args) {
        int obstacleGrid[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(findways(obstacleGrid));
    }
}
