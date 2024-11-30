public class leetcode_74 {
    public static boolean findd(int[][] matrix, int target) {
        int i=0;int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]>target){
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }else{
                return true;
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        int matrix[][] = { {1,3,5,7},{10,11,16,20},{23,30,34,60} }, target = 30;
        System.out.println(findd(matrix, target));
    }
}
