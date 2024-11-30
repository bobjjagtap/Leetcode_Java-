import java.util.*;
public class input_2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int a=sc.nextInt();
        System.out.println("enter the colum");
        int b=sc.nextInt();
        int array[][]=new int[a][b];
        System.out.println("enter the array");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println(array[a][b]);
}
}
