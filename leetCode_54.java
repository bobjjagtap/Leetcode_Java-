import java.util.ArrayList;
import java.util.List;

public class leetCode_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>list=new ArrayList<>();
        int left=0,right=matrix[0].length-1,top=0,buttom=matrix.length-1;
        while(left<=right && top<=buttom){
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= buttom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=buttom){
            for (int i = right; i >= left; i--) {
                list.add(matrix[buttom][i]);
            }
            buttom--;
            }
            if(left<=right){
            for (int i = buttom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        leetCode_54 lc = new leetCode_54();
        int[][] matrix = { { 1, 2, 3}, { 5, 6, 7 }, { 9, 10, 11 }, { 13, 14, 15 } };
        System.out.println(lc.spiralOrder(matrix));
    }
}
