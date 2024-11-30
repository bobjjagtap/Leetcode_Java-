import java.util.*;
public class rotation{
    public static void rotation(int array[],int key) {
       
                for(int j=0;j<key;j++){
                    int last;
                    last=array[array.length-1];
                    for(int k=array.length-1;k>0;k--){
                        array[k]=array[k-1];
                    }
                    array[0]=last;
                }
                
                    
        
    }
    public static void print(int array[]) {
        System.out.print("[");
        for(int j=0;j<array.length;j++){
            System.out.print(""+array[j]+",");
            }
            System.out.print("]");
        
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        int key=3;
        rotation(array,key);
        print(array);
    }
}