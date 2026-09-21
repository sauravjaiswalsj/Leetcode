class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;

        int low = 0, high = height.length-1;

        while (low < high){
            int length = high - low;
            int width = Math.min(height[low], height[high]);
            int area = length * width;

            maxArea = Math.max(area, maxArea);

            if (height[low] < height[high])
                low++;
            else 
                high--;
        }
        return maxArea;
    }
}