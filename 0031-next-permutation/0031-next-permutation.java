class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;

        for (int i = nums.length-1; i > 0; i--){
            // System.out.println(nums[i] + " "+ nums[i-1]);
            if (nums[i] > nums[i-1]){
                pivot = i-1;
                break;
            }
        }

        // System.out.println(pivot + " " + nums[pivot]);
        if (pivot >= 0){
            for (int i = nums.length-1; i > pivot; i--){
                if (nums[i] > nums[pivot]){
                    swap(nums, pivot, i);
                    break;
                }
            }
        }

        reverse(nums,pivot+1, nums.length-1);
    }

    private void swap(int[] nums, int idx, int pivot) {
        int temp = nums[idx];
        nums[idx] = nums[pivot];
        nums[pivot] = temp;
    }

    private void reverse(int[] arr, int l, int h){
        while (l <= h){
            swap(arr, l, h);
            l++;
            h--;
         }
    }
}