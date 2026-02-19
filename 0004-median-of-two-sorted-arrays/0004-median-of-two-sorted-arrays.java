class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        
        int x = nums1.length;
        int y = nums2.length;
        
        int low = 0, high = x;
        while (low <= high){
            int Px = (low + high)/2;
            int Py = (x+y+1)/2 - Px;
            
            // Now set boundaries
            int maxLeftX = (Px == 0) ? Integer.MIN_VALUE : nums1[Px-1];
            int minRightX = (Px == x) ? Integer.MAX_VALUE : nums1[Px];
            
            int maxLeftY = (Py == 0) ? Integer.MIN_VALUE: nums2[Py-1];
            int minRightY = (Py == y) ? Integer.MAX_VALUE : nums2[Py];
            
            if (maxLeftX <= minRightY && maxLeftY <= minRightX){
                //even
                if (((x+y) & 1)== 0){
                    return (double)(Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2.0;
                }else{
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            }
            else if (maxLeftX > minRightY){ // Go left
                high = Px - 1;
            }else{
                low = Px + 1;
            }
        }
        return 0.0;
    }
}