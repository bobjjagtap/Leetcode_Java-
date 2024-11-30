import java.util.Arrays;
public class nttData{
    public static void main(String[] args) {
        // int array[]={9,-3,8,-6,-7,8,10};
        // Arrays.sort(array);
        // int count =0;
        // for (int i = 0; i < array.length; i++) {
        //     if(array[i]<0){
        //         count++;
        //     }else{
        //         break;
        //     }
        // }
        // System.out.println(count);

//         String str="rosewood rose rosy rosemarry roshh";
//         String str2="ram rama ramesh rammohan ramanand";
//         String str3="jay jayesh jayaa jayeshree jayakant";
        
//         String[] finstr=str3.split(" ");

//         Arrays.sort(finstr);
//         String demo1=finstr[0];
//         String demo2=finstr[finstr.length-1];
//         String ans="";
//         for (int i = 0; i < finstr[0].length(); i++) {
//             if(demo1.charAt(i)==demo2.charAt(i)){
// ans+=demo1.charAt(i); 
//             }
//         }
// System.out.println(ans);

int array[]={1,6,7,9,17};
Arrays.sort(array);
int sum=0;
for (int i =array.length-2;i>=0;i--) {
    sum+=array[i+1]-array[i];
}
System.out.println(sum);

    }
}