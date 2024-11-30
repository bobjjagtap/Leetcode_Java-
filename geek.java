public class geek {
    
    public static boolean findd(int n,int k,int array[],int x) {
        int temp[]=new int[array.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=array[i];
        }
        for (int i = 1; i < array.length; i++) {
            int sum=0;
            array[i-1]=array[i-1] * k;
            array[i]=array[i] * k;
            for (int j = 0; j < array.length; j++) {
                sum+=array[j];
            }
            sum=sum/n;
            if(sum==x){
                
            System.out.println(sum); 
            return true; 
            }
            array[i]=temp[i];
            array[i-1]=temp[i-1];

        }
        return false;
    }
    public static void main(String[] args) {
        int array[]={9,7,1,9,9,5,7,9,2};
        
       System.out.println(findd(9,4,array,25));
    }
}
