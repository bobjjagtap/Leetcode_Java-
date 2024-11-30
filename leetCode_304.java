public class leetCode_304 {
    static int matrix[][];
    public static void NumMatrix(int[][] nums) {
         matrix=new int[nums.length][nums[0].length];
         int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum=0;
            for (int j = 0; j < matrix[0].length; j++) {  
                    matrix[i][j]=sum+=nums[i][j];
            }
        }
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         System.out.print(matrix[i][j]+" ,");
        //     }
        //     System.out.println();
        // }
    }
    
    public static int sumRegion(int row1, int col1, int row2, int col2) {
        int res=0;
        if(col1!=0){
        for(int i=row1;i<=row2;i++){
            res+=matrix[i][col2]-matrix[i][col1-1];
            //System.out.println(matrix[i][col1-1]);
            //System.out.println(matrix[i][col2]);
        }
    }else{
        for(int i=row1;i<=row2;i++){
        res+=matrix[i][col2];
        }
    }
        return res;
    }

    public static void main(String[] args) {
        int nums[][]={{1},{-7}};//,[0,0,0,0],[1,0,1,0],[0,0,1,0]]//{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1},{1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
    NumMatrix(nums);
    System.out.println(sumRegion(0, 0, 0, 0));
    System.out.println(sumRegion(1, 0, 1, 0));
    System.out.println(sumRegion(0, 0, 1, 0));
}
}