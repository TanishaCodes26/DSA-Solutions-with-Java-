class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet <Character> set = new HashSet<>();
       int left = 0;
       int count = 0;
       int max = 0;
       for(int right = 0; right < s.length(); right++){
        char ch = s.charAt(right);
        while(set.contains(ch)){
            set.remove(s.charAt(left));
            left++;
            count--;
        }
        set.add(ch);
        count++;

        if(count>max){
            max = count;
        }

       }
       return max;
    }
}