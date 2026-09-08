class Solution {
    public int countCommas(int n) {
        long count = 0;

        if (n >= 1000) {
            count += Math.min(n, 999999) - 1000 + 1;
        }

        if (n >= 1000000) {
            count += (long)(Math.min(n, 999999999) - 1000000 + 1) * 2;
        }

        if (n >= 1000000000) {
            count += (long)(n - 1000000000 + 1) * 3;
        }

        return (int) count;
    }
}