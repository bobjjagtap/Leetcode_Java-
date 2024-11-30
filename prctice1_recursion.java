
public class prctice1_recursion {
    public static void findkey(int array[],int key,int index) {
        int newt=0;
        if(array.length==index){
            
            return;
        }
        //kaam
        
        if(array[index]==key){
            System.out.println(index);
            findkey(array, key,index+1);
        }
        else{
            findkey(array, key, index+1);
        }
    
        
    }
    public static void main(String[] args) {
        int array[]={3, 2, 4, 5, 6, 2, 7, 2, 2},key=2;
        
        findkey(array,key,0);
        
    }
}
