import java.util.ArrayList;

public class leetCode_228 {
    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,7};
        int j=0;
        ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            j=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            if(j!=nums[i]){
                list.add(""+j+"->"+nums[i]);
            }else{
                list.add(""+j);
            }
        }
        System.out.println(list);
    }
}
