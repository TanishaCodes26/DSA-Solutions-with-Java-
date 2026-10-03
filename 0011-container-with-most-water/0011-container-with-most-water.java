class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length-1;
       int maxarea = Integer.MIN_VALUE;
       while(left<right){
        int area = (right - left) * Math.min(height[left],height[right]);
         if(Math.min(height[left],height[right]) == height[left]){
            left++;
         }else{
            right--;
         }
        if(area>maxarea){
            maxarea = area;
        }
       }
      return maxarea;
    }
}