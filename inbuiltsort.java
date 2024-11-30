import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort{

    public static void printarr(Integer array[]) {
        for(int i=0;i<array.length;i++){
        System.out.print(" "+array[i]+" ");   
        }     
    }


    public static void main(String[] args) {
        Integer array[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(array,Collections.reverseOrder());
        printarr(array);
}
}