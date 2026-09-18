class Solution {
    public boolean validPalindrome(String s) {
       if(s.length()==0 || s.length()==1 || s.length()==2){
        return true;
       }
       int start = 0;
       int end = s.length()-1;
       while(start <= end){
        if(s.charAt(start)==s.charAt(end)){
            start++;
            end--;
        }else{
            return ifPalindrome(s,start+1,end) || ifPalindrome(s,start,end-1);
        }
       }
       return true;

    }

    public boolean ifPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}