public class first_occurence_recuesion {
    public static int firstoccerance(int array[],int key,int i) {
        if(i==array.length){
            return -1;
        }
        int isfound=firstoccerance(array, key, i+1);
       // System.out.println(isfound);
        if(isfound == -1 && array[i] == key){
            return i;
        }
        return isfound;
       
    
       
       
    }
    public static void main(String[] args) {
        int array[]={12,34,46,78,90,12,34,5,67,12,44,7,5};
        int key=5;
        int i=0;
        System.out.println(firstoccerance(array, key,i));
    }
}
