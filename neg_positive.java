import java.util.*;
public class neg_positive{
    public static void main(String[] args) {
        int array[]={1,-1,2,3,4,5,-3,-2,8,9,7,0,2,-8,-4};
        for(int i=0;i<array.length;i++){
            if(0<=array[i]){
                System.out.print("negative no is= "+array[i]+",");
            }
            else
            {
                System.out.print("positive no is= "+array[i]+",");
            }
        }
    }
}