package DAY10;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left =0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            if(height[left]<height[right]){
                int water=(right-left)*height[left];
                max=Math.max(water,max);
                left++;
            }
            else{
                int water=(right-left)*height[right];
                max=Math.max(water,max);
                right--;
            }
        }
        return max;
    }
}
