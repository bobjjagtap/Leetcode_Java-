public class search_in_sorted_2dmatrix {
    public static void search(int array[][], int key) {
        int i = 0;
        int j = array[0].length - 1;

        while (i < array.length && j >= 0) {
            if (key == array[i][j]) {
                System.out.println("key found in[" + i + "," + j + "]");
                break;
            } else if (key < array[i][j]) {
                j--;
            } else {

                i++;
            }
        }

    }

    public static void main(String[] args) {
        int array[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        search(array, key);
    }

}
