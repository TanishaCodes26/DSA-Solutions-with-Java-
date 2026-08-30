class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_elem = piles[0];
        for(int i = 1; i < piles.length; i++){
             max_elem = Math.max(piles[i],max_elem);
        }
        int low = 1;
        int high = max_elem;
        int ans = max_elem;
         while(low<=high){
            int mid = low+(high-low)/2;
            long hours = totalh(piles, mid);
            if(hours <= h){
                 ans = mid;
                high = mid-1; 
            }else{
                
                 low = mid+1;
            }
        }
        
return ans;
    }

    public long totalh(int[]arr, int k){
        long total_hour = 0;
        for(int i = 0; i < arr.length;i++){
            total_hour += (long)(Math.ceil((double)arr[i]/k));

        }
      return total_hour;
    }
}
     