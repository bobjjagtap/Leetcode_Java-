import java.util.*;
public class midrevers{
    public static int revers(int key,int array[]) {
        for(int i=0;i<array.length;i++){
            if(key==array[i]){
                for(int j= array[i];j<array.length;j++){
                System.out.println(array[j]);
                }
                for(int k=0;k<array[i];k++){
                    System.out.println(array[k]);
                }
            
            }
            }
        return -1;
        }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key that find in array");
        int key = sc.nextInt();
        int array[]={1,2,3,4,5,6,7};
        revers(key,array);
    }
}