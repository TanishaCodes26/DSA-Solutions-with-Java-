class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);

        }
        for(int n : map.keySet()){
            if(map.get(n) > nums.length/3){
                arr.add(n);
            }
        }

        return arr;
        
    }
}