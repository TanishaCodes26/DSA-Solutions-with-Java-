class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandy = candies[0];
        for(int i = 0;i < candies.length; i++){
            maxcandy = Math.max(maxcandy, candies[i]);
        }
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i<candies.length; i++){
            int candy = candies[i] + extraCandies;
            if(candy>=maxcandy){
                list.add(true);
            }else{
                list.add(false);
            }
        } 

        return list;
    }
}