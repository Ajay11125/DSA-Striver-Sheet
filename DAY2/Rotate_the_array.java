public class Rotate_the_array {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];
        int l=k%n;
        int j=0;
        for(int i=n-l;i<n;i++){
            ans[j]=nums[i];
            j++;
        }
        for(int i=0;i<n-l;i++){
            ans[j]=nums[i];
            j++;
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}
