class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];

            if (sum == k){
                ++cnt;
            }

            int rem = sum -k;

            if (prefixSumMap.containsKey(rem)){
                cnt += prefixSumMap.getOrDefault(rem, 0);
            }
           prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}