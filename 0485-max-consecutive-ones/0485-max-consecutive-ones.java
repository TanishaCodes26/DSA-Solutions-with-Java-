class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0;
       int maxcount = Integer.MIN_VALUE;
       for(int i = 0; i < nums.length; i++){
        if(nums[i]==1){
            count++;
        }else{
                count = 0;
            }

            if(count>maxcount){
                maxcount = count;
        } 
    }

     return maxcount;
}
}