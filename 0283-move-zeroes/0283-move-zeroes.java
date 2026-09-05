class Solution {
    public void moveZeroes(int[] nums) {
      int z = 0;
      int nz = 0;
      while(nz < nums.length){
        if(nums[nz]!=0){
         int temp = nums[z];
         nums[z] = nums[nz];
         nums[nz] = temp;
         z++;
         
        }
        nz++;

      }
        
    }
}