class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        long sum = 0;
        long max = 0;
        Set<Integer> seen = new HashSet<>();

        while (r < n){
            while (seen.contains(nums[r])){
                seen.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            seen.add(nums[r]);
            sum += nums[r];

            if (r - l + 1 > k){
                seen.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            if (r - l + 1 == k)
                max = Math.max(max, sum);

            ++r;
        }
        return max;
    }
}