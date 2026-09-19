class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, windowFreq)) {
            result.add(0);
        }

        for (int right = p.length(); right < s.length(); right++) {

            windowFreq[s.charAt(right) - 'a']++;

            int left = right - p.length();
            windowFreq[s.charAt(left) - 'a']--;

            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(left + 1);
            }
        }

        return result;
    }
}