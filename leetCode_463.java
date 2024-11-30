public class leetCode_463 {
    public static int islandPerimeter(int[][] grid) {
        int parameter=0;
        for(int i=0;i<grid.length;i++){
for(int j=0;j<grid[0].length;j++){
       if(grid[i][j]==1){
parameter+=4;
           
    if(i>0&&grid[i-1][j]==1){
parameter-=2;
    } 
    if(j>0&&grid[i][j-1]==1){
parameter-=2;
    }
        }
        }
        }
        return parameter;
    }
    public static void main(String[] args) {
       int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println( islandPerimeter(grid));
    }
}
