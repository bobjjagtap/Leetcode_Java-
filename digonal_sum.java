public class digonal_sum {
    public static void diagonal(int[][] array) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(i==j){
                    sum1+=array[i][j];
                }
                    if(array.length-1==i+j){
                        sum2+=array[i][j];
                    }
                
            }
            }
        System.out.println("primary diagonal sum = "+sum1);
        System.out.println("secondary diagonal sum = "+sum2);
        
    }

    public static void main(String[] args) {
        int array[][] = { { 1, 1, 1, 1 },
                          { 5, 1, 1, 8 },
                          { 9, 1, 1, 12 },
                          { 1, 14, 15, 1 } };
        diagonal(array);
    }
}
