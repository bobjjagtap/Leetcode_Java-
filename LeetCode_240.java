public class LeetCode_240 {
    public static void main(String[] args) {
       // int matrix[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,2},{418,21,23,26,30}};
        int matrix[][]={{-1,-1}};
        int target=-2;
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int matrix[][],int target) {
        
    
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if(target==matrix[i][j])return true;
                else if(matrix[i][j]>target){
                    break;
                }
            }
            for (int j = i; j < matrix.length; j++) {
                if(target==matrix[j][i])return true;
                else if(matrix[j][i]>target){
                    break;
                }
            }
        }
        return false;
    }
}
