//Median of Two Sorted Arrays
public class leetcode4 {
    public static void meargarr(int arr[], int array[]) {
        int m=arr.length+array.length;
        int temp[] = new int[m];
        int temp1[] = new int[m];
        int temp2[] = new int[m];
        int i = 0, j = 0;
        int k = 0;
        //System.out.println("qdqWCDWcWDS");
        while (i <= arr.length - 1 && j <= array.length - 1) {
            if (arr[i] < array[j]) {
                temp[k] = arr[i];
                i++;
                System.out.print(temp[k]);
                if(i==array.length-1){
                    while(i<=array.length-1){
                        temp2[k]=array[j];
                        System.out.print(temp2[k]);
                    k++;j++;
                    }
                    // if(j==arr.length-1){
                    //     while(j<=array.length-1){
                    //         temp2[k]=array[i];
                    //         System.out.print(temp2[k]);
                    //     k++;i++;
                    //     }

                
            } else {
                temp1[k] = array[j];
                j++;
                System.out.print(temp1[k]);
            }
            k++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 7,10,11,12};
        int array[] = { 3, 4, 5, 8, 9 };
        meargarr(arr, array);
    }

}
