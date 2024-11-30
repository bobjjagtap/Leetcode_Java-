public class last_occurence_recursion {
    public static int laastoccurance(int array,int key,int i) {
        if(i == array.length){
            return -1;
        }
        int isfound=laastoccurance(array, key, i+1);
        if(isfound == -1 && array[i] == key){
            return i;
        }
        return isfound;
       
    }
    public static void main(String[] args) {
        int array[]={12,34,46,78,90,12,34,5,67,12,44,7};
        int key=34;
        int i=0;
        System.out.println(laastoccurance(array,key,i));
    }

}
