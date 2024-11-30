import java.util.HashSet;

public class leeCode_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>list=new HashSet<>();
        for(int num:nums){
            if(list.contains(num)){
                return true;
            }
            list.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        leeCode_217 lc=new leeCode_217();
        int nums[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println(lc.containsDuplicate(nums));
    }
}
