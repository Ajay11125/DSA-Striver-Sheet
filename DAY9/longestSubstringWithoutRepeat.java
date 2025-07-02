public class longestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==1){
            return n;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            String temp="";
            temp+=s.charAt(i);
            for(int j=i+1;j<n;j++){
                String chr="";
                chr+=s.charAt(j);
                if(temp.contains(chr)){
                    // System.out.println("if: "+temp);
                    ans=Math.max(ans,temp.length());
                    break;
                }
                else{
                    // System.out.println("else: "+temp);
                    temp+=s.charAt(j);
                    ans=Math.max(ans,temp.length());
                }

            }
        }
        return ans;
    }
}
// Better Approach
// static int solve(String s) {
//     HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

//     int left = 0, right = 0;
//     int n = s.length();
//     int len = 0;
//     while (right < n) {
//         if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

//         mpp.put(s.charAt(right), right);

//         len = Math.max(len, right - left + 1);
//         right++;
//     }
//     return len;
// }