class Solution {
    public int search(int[] nums, int target) {
        int pivot = getPivot(nums, nums.length);
        if (nums[pivot] == target)
            return pivot;

        int firstHalf = binSearch(nums, 0, pivot, target);
        int secondHalf = binSearch(nums, pivot, nums.length - 1, target);

        System.out.println(pivot + " " + firstHalf + " " + secondHalf);

        return (firstHalf != -1 ? firstHalf : secondHalf != -1 ? secondHalf : -1); 
    }

    private int getPivot(int[] arr, int n){
        int low = 0, high = n - 1;
        if (arr[low] <= arr[high])
            return low;

        while (low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid] < arr[(mid + n -1)%n] && arr[mid] < arr[(mid + 1)%n])
                return mid;
            if (arr[mid] < arr[high])
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return -1;
    }

    private int binSearch(int[] arr, int low, int high , int key){
        while (low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                high = mid -1 ;
            else 
                low = mid + 1; 
        }
        return -1;
    }
}