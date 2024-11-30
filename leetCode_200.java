public class leetCode_200 {
    public int numIslands(String[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=="1"){
                count++;
                dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public void dfs(String grid[][],int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!="1"){
            return ;
        }

        grid[i][j]="0";
        dfs(grid, i+1, j);//down;
        dfs(grid, i-1, j);//up;
        dfs(grid, i, j+1);//right;
        dfs(grid, i, j-1);//left;
        return;
    }
    public static void main(String[] args) {
        leetCode_200 lc=new leetCode_200();
        String grid[][] = {
            {"1","1","1","0","0"},
            {"1","1","0","0","0"},
            {"0","0","1","0","0"},
            {"0","0","0","0","1"},
          };
          System.out.println(lc.numIslands(grid));
    }
}
