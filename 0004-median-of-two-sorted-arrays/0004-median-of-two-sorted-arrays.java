class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int x = nums1.length;
        int y = nums2.length;

        int l = 0, r = x;
        while (l <= r){
            int Px = (l+r)/2;
            int Py = (x+y+1)/2 - Px;

            int maxLeftX = (Px == 0) ? Integer.MIN_VALUE : nums1[Px-1];
            int minRightX = (Px == x) ? Integer.MAX_VALUE : nums1[Px];
            
            int maxLeftY = (Py == 0) ? Integer.MIN_VALUE : nums2[Py-1];
            int minRightY = (Py == y) ? Integer.MAX_VALUE : nums2[Py];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX){
                if ((x+y & 1) == 0){
                    return (double)(Math.max(maxLeftX, maxLeftY)+ Math.min(minRightX, minRightY))/2.0;
                }else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            }else if (maxLeftX > minRightY)
                r = Px - 1;
            else
                l = Px + 1;
        }
        return 0.0;
    }
}