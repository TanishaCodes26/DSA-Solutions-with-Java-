class Solution {
    public int maxProduct(int[] nums) {

        int currentMax = nums[0];
        int currentMin = nums[0];
        int maxProd = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int oldMax = currentMax;
            int oldMin = currentMin;

            currentMax = Math.max(
                nums[i],
                Math.max(nums[i] * oldMax,
                         nums[i] * oldMin)
            );

            currentMin = Math.min(
                nums[i],
                Math.min(nums[i] * oldMax,
                         nums[i] * oldMin)
            );

            maxProd = Math.max(maxProd, currentMax);
        }

        return maxProd;
    }
}