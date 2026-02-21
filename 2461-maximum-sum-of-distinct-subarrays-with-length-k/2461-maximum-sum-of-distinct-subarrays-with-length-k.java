class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        long max = 0;
        long sum = 0;
        Set<Integer> set = new HashSet<>();
        while (j < nums.length){
            if (!set.contains(nums[j])){
                set.add(nums[j]);
                sum += nums[j];
            }else{
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
                continue;
            }

            if (j - i + 1 < k){
                ++j;
                continue;
            }
                
            
            if (j - i + 1 == k){
                max = Math.max(max, sum);
                ++j;
                
                sum -= nums[i];
                set.remove(nums[i]);
                ++i;
                
            }
        }
        return max;
    }
}