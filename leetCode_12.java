public class leetCode_12 {
    public String solvee(int num){
        String roman="";
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for (int i = 0; i < nums.length; i++) {
            while(num>=nums[i]){
                roman+=str[i];
                num-=nums[i];
            }
            
        }
        return roman;
     }
    public static void main(String[] args) {
        int nums=12;
        leetCode_12 l=new leetCode_12();
        System.out.println(l.solvee(nums));
    }
}
