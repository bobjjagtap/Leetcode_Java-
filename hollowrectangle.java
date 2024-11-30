import java.util.*;
public class hollowrectangle{
    public static void hollow(int colume,int row) {
        //outer loop
        for(int i=1;i<=colume;i++){
            //inner loop
            for(int j=1;j<=row;j++){
                if(i==1||i==colume||j==row||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[]srgs) {
        Scanner sc = new Scanner(System.in);
        int colume=sc.nextInt();
        int row=sc.nextInt();
        hollow(colume,row);
        
    }

}