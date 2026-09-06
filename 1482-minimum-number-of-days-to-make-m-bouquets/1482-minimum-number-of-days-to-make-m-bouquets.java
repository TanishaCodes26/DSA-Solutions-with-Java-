class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int minday = bloomDay[0];
        int maxday = bloomDay[0];

        for (int i = 0; i < bloomDay.length; i++) {
            minday = Math.min(minday, bloomDay[i]);
            maxday = Math.max(maxday, bloomDay[i]);
        }

        int start = minday;
        int end = maxday;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (possible(bloomDay, mid, m, k)) {
                
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public boolean possible(int arr[], int day, int m, int k) {

        int count = 0;
        int boq = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= day) {
                count++;
                if (count == k) {
                    boq++;
                    count = 0;
                }

            } else {
                count = 0;
            }
        }

        return boq >= m;
    }
}