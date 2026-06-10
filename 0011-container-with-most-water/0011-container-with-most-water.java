class Solution {
    public int maxArea(int[] height) {
        int areaMax = 0;

        int low = 0, high = height.length -1;

        while (low < high){
            int width = high - low;
            int area = width * Math.min(height[low], height[high]);
            areaMax = Math.max(area, areaMax);

            if (height[low] < height[high])
                low++;
            else high--;
        }
        return areaMax;
    }
}