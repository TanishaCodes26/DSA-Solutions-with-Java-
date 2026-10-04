class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxfreq = Integer.MIN_VALUE;
        int maxwindow = Integer.MIN_VALUE;
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);
            int windowlength = (right - left) +1;
            int replacement = windowlength - maxfreq;
            if(replacement > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxwindow = Math.max(maxwindow, right-left+1);
        }

        return maxwindow;
    }
}