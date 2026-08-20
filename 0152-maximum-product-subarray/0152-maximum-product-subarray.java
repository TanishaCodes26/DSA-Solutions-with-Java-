class Solution {
    public int maxProduct(int[] nums) {

        int MaxProd = nums[0];
       
        for(int i = 0 ; i < nums.length; i++){
           int CurrentProd = 1;
           for(int j = i; j < nums.length; j++){
            CurrentProd = CurrentProd * nums[j];
            if(CurrentProd > MaxProd){
                MaxProd = CurrentProd;
            }
           }

        }

        return MaxProd;

        
    }
}