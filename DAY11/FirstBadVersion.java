package DAY11;
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left=0;
        int right=n;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
    // Ignore this
    public static boolean isBadVersion(int version){
        return true;
    };
    // ---------
}
