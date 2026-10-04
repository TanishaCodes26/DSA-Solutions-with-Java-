class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int length = s.length()-1;
        int maxlength = Integer.MIN_VALUE;
        for(right = 0; right <= length; right++){
           while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
           }
           set.add(s.charAt(right));

           maxlength = Math.max(maxlength, right-left+1);
            
        }

        return maxlength == Integer.MIN_VALUE ? 0 : maxlength;
    }
}