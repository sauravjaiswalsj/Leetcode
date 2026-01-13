class Solution {
    public int[] searchRange(int[] nums, int target) {
        return (new int[] {lowerBound(nums, target), upperBound(nums, target)});
    }

    private int lowerBound(int[] arr, int target){
        int low = 0, high = arr.length - 1;

        int lowBound = -1;
        while (low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target){
                lowBound = mid;
                high = mid - 1;
            }
            else if (arr[mid] < target){
                low = mid + 1;
            }
            else 
                high = mid - 1;
        }
        return lowBound;
    }

    private int upperBound(int[] arr, int target){
        int low = 0, high = arr.length - 1;

        int upper = -1;
        
        while (low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target){
                upper = mid;

                low = mid + 1;
            }
            else if (arr[mid] < target)
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return upper;
    }
}