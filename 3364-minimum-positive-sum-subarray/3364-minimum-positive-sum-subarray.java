
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int size = l; size <= r; size++) {

            int sum = 0;

            // Calculate initial window sum
            for (int i = 0; i < size; i++) {
                sum += nums.get(i);
            }

            if (sum > 0) {
                minSum = Math.min(minSum, sum);
            }

            // Slide the window
            for (int i = size; i < n; i++) {

                sum += nums.get(i);
                sum -= nums.get(i - size);

                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
