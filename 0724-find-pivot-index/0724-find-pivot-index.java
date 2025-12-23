class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int i : nums)
            totalSum += i;

        int currSum = 0;

        for (int i = 0; i < nums.length; i++){
            int diff = totalSum - currSum - nums[i];

            if (diff == currSum)
                return i;
            
            currSum += nums[i];
        }

        return -1;
    }
}