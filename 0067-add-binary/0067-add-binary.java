class Solution {
    public String addBinary(String a, String b) {
     int carry = 0; 
     int i = a.length()-1;
     int j = b.length()-1; 
     int sum = 0;
     StringBuilder result = new StringBuilder();
     while(i>=0 || j>=0 || carry != 0){
            int bitA = 0;
            int bitB = 0;
            if (i >= 0) {
                bitA = a.charAt(i) - '0';
            }

            if (j >= 0) {
                bitB = b.charAt(j) - '0';
            }

        sum = bitA + bitB + carry;
        carry = sum/2;
        result.append(sum%2);
        i--;
        j--;
     } 

     return result.reverse().toString();
    }
}