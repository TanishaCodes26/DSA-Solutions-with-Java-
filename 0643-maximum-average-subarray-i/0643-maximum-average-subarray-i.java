class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum = 0;
        for(int i = 0; i<k; i++){
            windowsum += nums[i];
        }

        int maxsum = windowsum;
        for(int j = k; j<nums.length; j++){
            windowsum += nums[j];
            windowsum -= nums[j-k];

            maxsum = Math.max(windowsum,maxsum);
        }

        return (double) maxsum/k;
    }
}