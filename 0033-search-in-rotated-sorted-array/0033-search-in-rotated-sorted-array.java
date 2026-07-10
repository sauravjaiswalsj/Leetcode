class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int n = nums.length;
        int pivot = getPivot(nums, 0, n-1, n);
        
        if (nums[pivot] == target)
            return pivot;
        
        System.out.println(pivot);
        int leftHalf = binSearch(nums, 0, pivot, target);
        int rightHalf = binSearch(nums, pivot, n-1, target);
        
        return (leftHalf != -1 ? leftHalf : rightHalf != -1 ? rightHalf : -1);
    }
    
    private int getPivot(int[] nums, int low, int high, int n){
        if (low > high)
            return -1;
        
        if (nums[low] <= nums[high])
            return low;
        
        int mid = low + (high - low)/2;
        
        if (nums[mid] < nums[(mid + 1)%n] && nums[mid] < nums[(mid + n - 1)%n])
                return mid;
        else if (nums[mid] < nums[high])
            return getPivot(nums, low, mid - 1, n);
        else
            return getPivot(nums, mid +1, high, n);
    }
    
    private int binSearch(int[] nums, int low, int high, int target){
        if (low > high)
            return -1;
        int mid = low + (high - low)/2;
        
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] < target)
            return binSearch(nums, mid + 1, high, target);
        else
            return binSearch(nums, low, mid - 1, target);
    }
}