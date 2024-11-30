import java.util.*;

public class spiral_martix {
    public static void spiral(int array[][]) {
        int startrow = 0;
        int startcolum = 0;
        int endrow = array.length - 1;
        int endcolum = array[0].length - 1;
        System.out.println(endcolum);
        System.out.println(endrow);
        // top
        while (startrow <= endrow && startcolum <= endcolum) {

            for (int i = startcolum; i <= endcolum; i++) {
                System.out.println(array[startrow][i]);
            }
            // right
            for (int i = startrow+1; i <= endrow; i++) {
                System.out.println(array[i][endcolum]);
            }
            // bottam
            for (int i = endcolum - 1; i >= startcolum; i--) {
                if(startrow==endrow){
                    break;
                }
                System.out.println(array[endrow][i]);
            }
            // left
            for (int i = endrow - 1; i >=startrow+1; i--) {
                if(startcolum==endcolum){
                    break;
                }
                System.out.println(array[i][startcolum]);
            }
            startrow++;
            startcolum++;
            endrow--;
            endcolum--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int a = sc.nextInt();
        System.out.println("enter the colum");
        int b = sc.nextInt();
        int array[][] = new int[a][b];
        System.out.println("enter the array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        spiral(array);
    }
}
