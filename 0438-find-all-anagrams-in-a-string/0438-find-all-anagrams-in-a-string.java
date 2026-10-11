class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    int window = p.length();   
     int freq[] = new int[26];
     int windowfreq[] = new int[26];
    
     if (p.length() > s.length()) {
            return result;
        } 
     
     
     for(int i = 0; i < p.length(); i++){
        freq[p.charAt(i)  - 'a']++;
     }
     for(int i = 0; i < window; i++){
        windowfreq[s.charAt(i) - 'a']++;
     }

      if(Arrays.equals(freq, windowfreq)) {
            result.add(0);
        }
     for(int right = window; right < s.length(); right++){
        windowfreq[s.charAt(right-window) - 'a']--;
        windowfreq[s.charAt(right) - 'a']++;
         if (Arrays.equals(freq, windowfreq)) {
                result.add(right - window + 1);
            }
     }
     return result;
    }
}