class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            if(nums[val-1]>0){
                nums[val-1] = Math.negateExact(nums[val-1]);
            }else{
                count.add(val);
            }
        }
        
        return count;
    }
}