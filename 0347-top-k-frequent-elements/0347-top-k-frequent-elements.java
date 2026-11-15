class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencymap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            frequencymap.put(nums[i], frequencymap.getOrDefault(nums[i],0)+1);
        }
        for(int key : frequencymap.keySet()){
            int frequency = frequencymap.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        for(int pos  = bucket.length-1; pos >= 0 && counter < k; pos--){
            if(bucket[pos] != null){
                for(Integer integer : bucket[pos]){
                    res[counter++] = integer;
                    if(counter == k) {
    break;
}
                }
            }
        }

        return res;
    }
}