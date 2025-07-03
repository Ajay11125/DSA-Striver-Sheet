package DAY10;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0;
        int p2=0;
        int[] arr=new int[m+n];
        int p=0;
        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                arr[p]=nums1[p1];
                p1++;
                p++;
            }
            else{
                arr[p]=nums2[p2];
                p2++;
                p++;
            }
        }
        while(p1<m){
            arr[p]=nums1[p1];
            p++;
            p1++;
        }
        while(p2<n){
            arr[p]=nums2[p2];
            p++;
            p2++;
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
    }
}
