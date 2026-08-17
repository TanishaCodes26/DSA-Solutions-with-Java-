class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for(i = nums.length-2; i>=0; i--){
            if(nums[i]< nums[i+1]){
                break;  
                }
        }
        if(i >= 0){
        int j = nums.length-1;
        while(nums[j] <= nums[i]){
            j--;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }
        int l = i+1;
        int r = nums.length-1;
        while(l<r){
             int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;

            l++;
            r--;
        }

        
        
    }
}