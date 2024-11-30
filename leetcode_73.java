import java.util.ArrayList;

public class leetcode_73 {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer>list=new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    list.add((i*1000)+j);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int m=list.get(i)/1000;
            int n=list.get(i)%1000;

            for (int j = 0; j < matrix.length; j++) {
                matrix[m][j]=0;
            }
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][n]=0;
            }
        }
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        leetcode_73 lc=new leetcode_73();
        int matrix[][] = {{1,1,0},{1,0,1},{1,1,1}};
       lc.setZeroes(matrix);
    }
    
}
