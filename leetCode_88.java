import java.util.*;

public class leetCode_88 {
    public static void merge(int[] nums1,int m,int[] nums2,int n) {
        for (int i =0; i < nums2.length; i++) {
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
    public static void main(String[] args) {
        int nums1[]={-1,0,0,3,3,3,0,0,0};
        int nums2[]={1,2,2};
        merge(nums1,6,nums2,3);
    }
}
