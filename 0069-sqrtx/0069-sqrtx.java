class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int i = 1;
        int r = x;
        int ans = 1;  
        while (i <= r) {
            int mid = i + (r - i) / 2;
            if (mid != 0 && mid <= x / mid) {
                i = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}