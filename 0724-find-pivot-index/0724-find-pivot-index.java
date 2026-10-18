class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        int l_sum = Integer.MIN_VALUE;
        int r_sum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            l_sum = (i == 0) ? 0 : nums[i-1] ;
            r_sum = nums[nums.length-1] - nums[i];
            if(l_sum == r_sum){
                return i;
            }
        }
        return -1;
    
    }
}