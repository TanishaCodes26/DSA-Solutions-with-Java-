class Solution {
    public void rotate(int[] nums, int k) {
        int l = 0;
        int r = nums.length-1;
        k = k % nums.length;
        reverse(l,r,nums);
        reverse(l,k-1,nums);
        reverse(k,r,nums);
    }
    public void reverse(int start, int end, int[] arr){
         while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

         }
    }
}