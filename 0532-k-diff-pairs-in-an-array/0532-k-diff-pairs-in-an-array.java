class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int abs = Math.abs(nums[i] - nums[j]);

                if (abs == k){
                    set.add(Math.min(nums[j], nums[i]));
                }
            }
        }
        return set.size();
    }
}