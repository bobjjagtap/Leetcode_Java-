public class leetcode_64 {
    public static int minsum(int[][] grid) {
        int m=grid.length-1;
        int n=grid[0].length-1;
    for (int i = 1; i < grid.length; i++) {
        grid[i][0]+=grid[i-1][0];
    }
    for (int i = 1; i < grid.length; i++) {
        grid[0][i]+=grid[0][i-1];
    }
    for (int i = 1; i < grid.length; i++) {
        for (int j = 1; j < grid.length; j++) {
            grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
        }
    }
    return grid[m][n];
        
    }
    public static void main(String[] args) {
        int grid[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minsum(grid));
    }
}
