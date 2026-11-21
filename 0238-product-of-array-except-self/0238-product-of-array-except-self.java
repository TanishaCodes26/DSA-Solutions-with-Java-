class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int leftproduct = 1;
        for(int i = 0; i < nums.length; i++){
            arr[i] = leftproduct;
            leftproduct *= nums[i];
        }
        int rightproduct = 1;
        for(int i = nums.length-1;  i >=  0; i--){
            arr[i] *= rightproduct;
            rightproduct *= nums[i];
        }

        return arr;
    }
}