import java.util.*;

public class bubblesort {
    public static void sort(int array[]) {
        int swap = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap++;
                }
            }
        }
        System.out.println("total swap is="+swap);
    }
    public static void printarr(int array[]) {
        for(int i=0;i<array.length;i++){
        System.out.println(array[i]);   
        }     
    }


    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        sort(array);
        printarr(array);
    }
}
