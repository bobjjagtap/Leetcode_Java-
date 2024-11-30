import java.util.*;
 
public class array2dmulti {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
 
      int matrix[][] = new int[row][col];
      //input
      //row 
      for(int i=0; i<row; i++) {
        //colum
           for(int j=0; j<col; j++) {
               matrix[i][j] = sc.nextInt();
               //the first number input go through colum 1 2 3
               //                                        4 5.. that means line by line         
           }
        }
System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<col ;j++) {                  
          for(int i=0; i<row; i++) {
            /*in this alternet the martix 
              that look like
              1 5
              2 6
              3 7
              4  .....so more there will be first
              go through the rows and print row first*/
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
   }
}
