import java.util.*;
public class leet{
public static void main(String[] args) {
    int array1[]={1,2};
    int array2[]={3,4};
    int temp[]=new int[array1.length+array2.length];
    mearge(array1,array2,temp);
}
private static void mearge(int array1[],int array2[],int temp[]) {
    int i=0,k=0,j=0;
    while(i<array1.length){
        temp[k++]=array1[i++];
    }
    while(j<array2.length){
        temp[k++]=array2[j++];
    }
    Arrays.sort(temp);
    for (int l = 0; l < temp.length; l++) {
        System.out.print(" "+temp[l]);
    }
    int mid=(temp.length)/2;
    if((temp.length)%2 ==0){
        float sum=((float)temp[mid-1]+temp[mid])/2;
        System.out.println();
        System.out.println("median is = "+sum);
    }
    else{
        System.out.println();
        System.out.println("median is = "+temp[mid]);
    }
    
    
}
}