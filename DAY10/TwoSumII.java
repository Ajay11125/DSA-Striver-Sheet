package DAY10;
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int[] arr=new int[2];
        while(left<right){
            if(numbers[right]+numbers[left]==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            else if(numbers[right]+numbers[left]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return arr;
    }
}
