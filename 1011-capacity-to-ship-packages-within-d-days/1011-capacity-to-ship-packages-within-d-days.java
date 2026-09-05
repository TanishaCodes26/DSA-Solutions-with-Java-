class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minValid = weights[0];
        int maxValid = 0;
        for(int i = 0;i <= weights.length-1; i++){
            minValid = Math.max(minValid,weights[i]);
        }
        for(int i = 0; i <= weights.length-1; i++){
            maxValid += weights[i]; 
        }

        int start = minValid;
        int end = maxValid;
        while(start<=end){
            int mid = start+(end-start)/2;
           int daysNeeded = 1;
           int currentWeight = 0;
           for(int weight : weights){
            if(currentWeight+weight>mid){
                daysNeeded++;
                currentWeight = 0;
            }
            currentWeight += weight;
           }
           if(daysNeeded > days){
            
            start = mid+1;
           }else{
            end = mid-1;
           }

        }

        return start;
    }
}