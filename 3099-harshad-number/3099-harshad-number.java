class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int p = x;
        int sum = 0;
        int q = 0;
        while(p > 0){
          q = p % 10;
          sum = sum + q;
          p = p / 10;
        }
        if(x % sum == 0){
            return sum;
        }else{
            return -1;
        }
    }
}