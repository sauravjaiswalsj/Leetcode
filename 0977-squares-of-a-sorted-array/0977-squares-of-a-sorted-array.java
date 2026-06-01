class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n -1;
        int[] arr = new int[n];

        int pos = n-1;

        while (low <= high){
            int ls = nums[low] * nums[low];
            int rs = nums[high] * nums[high];

            if (ls > rs){
                arr[pos] = ls;
                low++;
            }else{
                arr[pos] = rs;
                high--;
            }
            pos--;
        }
        return arr;
    }
}