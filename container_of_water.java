public class container_of_water {
    public static void calculate(int array[]) {
        int max = 0, i = 0, j = array.length-1, width = 0, sum = 0;
        while (i < j) {
            if (array[i] > array[j]) {
                width = j - i;
                sum = width * array[j];
                max = Math.max(sum, max);
                //System.out.print("jayesh");
                j--;
             } 
             else if (array[i] < array[j]) {
                width = j - i;
                sum = width * array[i];
                max = Math.max(sum, max);
                 //System.out.print("jagtap");
                i++;
             } else {
                width = j - i;
                sum = width * array[i];
                max = Math.max(sum, max);
                i++;
                j--;
            }
        }
         System.out.print(max);

    }

    public static void main(String[] args) {
        int array[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        calculate(array);
    }
}
