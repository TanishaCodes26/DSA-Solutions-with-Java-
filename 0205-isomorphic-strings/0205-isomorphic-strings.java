class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b){
                    return false;
                }
            }else{
                if(set.contains(b)){
                    return false;
                }
                set.add(b);
                map.put(a,b);
            }
        }

        return true;
        
    }
}