class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n - 1;
        System.out.println(high + " ");
        while (low < high) {
            int mid = low + (high - low) / 2;
            int lessOrEqual = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] <= mid) {
                    lessOrEqual++;
                }
            }
            System.out.print(low + " l: ");
            System.out.print(mid + " m: ");
            System.out.print(lessOrEqual + " \n");
            if (lessOrEqual <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
