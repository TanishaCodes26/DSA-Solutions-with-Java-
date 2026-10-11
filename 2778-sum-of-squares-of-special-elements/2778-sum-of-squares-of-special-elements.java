class Solution {
    public int sumOfSquares(int[] nums) {
         List<Integer> arr = new ArrayList<>();
         int n = nums.length;
         for(int i = 0; i < n; i++){
            if(n%(i+1) == 0){
                arr.add(nums[i]);
            }
         }
         
         int sum = 0;
         for(int val : arr){
            sum += (val*val);
         }

         return sum;
    }
}