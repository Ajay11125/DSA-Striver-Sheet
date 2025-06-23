class Kadane_Algo{
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int sum=0;
        while(i<nums.length){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            
            i++;
        }
        return max;
    }
}