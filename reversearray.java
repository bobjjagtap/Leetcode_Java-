import java.util.*;

public class reversearray {
    public static void reversearray(int array[]) {
        int temp, first = 0;
        int last = array.length - 1;

        while (first < last) {

            temp         =   array[last];
            array[last]  =   array[first];
            array[first] =   temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number as you want array");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        reversearray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}