class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];
            int i = 0;
            while(i < str.length() ){
            freq[str.charAt(i) - 'a']++;
            i++;
        }
        String key = Arrays.toString(freq);
        if(map.containsKey(key)){
            map.get(key).add(str);
        }else{
            map.put(key, new ArrayList<>());
             map.get(key).add(str);
        }
        
            }
        return new ArrayList<>(map.values());
}
}
