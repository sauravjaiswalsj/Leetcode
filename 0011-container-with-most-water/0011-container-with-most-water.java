class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int low = 0, high = height.length-1;

        while (low < high){
            int area = (high - low) * Math.min(height[low], height[high]);
            max = Math.max(max, area);
            if (height[low] < height[high]) low++;
            else high--;
        }
        return max;
    }
}