class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        if (nums[low] <= nums[high])
            return nums[low];

        while (low <= high){
            int mid = low + (high - low)/2;

            if (nums[mid] < nums[(mid + 1) % n] && nums[mid] < nums[(mid + n - 1) % n])
                return nums[mid];
            if (nums[mid] < nums[high])
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return -1;
    }
}