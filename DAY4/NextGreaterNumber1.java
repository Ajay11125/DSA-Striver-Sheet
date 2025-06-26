package DAY4;

public class NextGreaterNumber1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean flag=false;
            int temp=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    flag=true;
                }
                if(nums2[j]>nums1[i]&&flag){
                    temp=nums2[j];
                    break;
                }
            }
            ans[i]=temp;
        }
        return ans;
    }
}
