import java.util.Stack;

public class Next_greater_element {
    public static void chack(int[] arr) {
        Stack <Integer> s=new Stack<>();
        int fin[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            fin[i]=-1;
        }else{
            fin[i]=arr[s.peek()];
        }
        s.push(i);
        }
         
        /* brout froce 
        for (int i = 0; i < arr.length; i++) {
            fin[i]=-1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    fin[i]=arr[j];
                    break;
                }
            }
        }*/
        for (int i = 0; i < fin.length; i++) {
            System.out.print(fin[i]+",");
        }
    }
    public static void main(String[] jayesh) {
        int arr[]={6,8,0,1,3};
        chack(arr);
    }
}
