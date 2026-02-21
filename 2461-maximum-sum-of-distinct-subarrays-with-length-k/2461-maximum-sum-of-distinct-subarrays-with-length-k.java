class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        long sum = 0;
        long max = 0;
        Set<Integer> seen = new HashSet<>();

        for (int right = 0; right < n; right++) {
            // 1) Ensure all elements are distinct by shrinking from left
            while (seen.contains(nums[right])) {
                seen.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // 2) Add current element
            seen.add(nums[right]);
            sum += nums[right];

            // 3) If window too big (> k), shrink from left
            if (right - left + 1 > k) {
                seen.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // 4) If window size == k, update answer
            if (right - left + 1 == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
