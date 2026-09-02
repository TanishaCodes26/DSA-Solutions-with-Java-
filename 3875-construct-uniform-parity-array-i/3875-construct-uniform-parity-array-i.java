class Solution {
    public boolean uniformArray(int[] nums1) {
        int even = 0;
        int odd = 0;
        for(int n : nums1){
            if(n%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return even == 0 || odd == 0 || even >= 1 || odd >= 1;
    }
}