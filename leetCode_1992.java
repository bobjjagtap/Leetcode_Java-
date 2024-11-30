import java.util.ArrayList;

public class leetCode_1992 {
    public int[][] findFarmland(int[][] land) {
        ArrayList<int[]>list=new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if(land[i][j]==1){
                    list.add(find_land(land,i,j));
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
    public int[] find_land(int[][] land ,int row,int col){
        int coordinates[]=new int[4];
        coordinates[0]=row;
        coordinates[1]=col;

        int m=land.length;
        int n=land[0].length;
        int r=row;
        int c=col;
        while (r<m && land[r][col]==1)r++;
        while (c<n && land[row][c]==1)c++;

        coordinates[2]=r-1;
        coordinates[3]=c-1;
        for (int i = row; i <r ; i++) {
            for (int j = col; j < c; j++) {
                land[i][j]=0;
            }
        }
        return coordinates;
    }
    public static void main(String[] args) {
        leetCode_1992 lc=new leetCode_1992();
        int land[][]={{1,0,0},{0,1,1},{0,1,1}};
        lc.findFarmland(land);
    }
}
