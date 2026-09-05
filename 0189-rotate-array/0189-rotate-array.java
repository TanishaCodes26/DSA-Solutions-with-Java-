class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int l = 0;
        int r = nums.length-1;
        rotation(l,r,nums);
        rotation(l,k-1,nums);
        rotation(k,r,nums);
       
 }
 public void rotation(int start, int end, int[] arr){
    while(start <= end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

 }
  }

