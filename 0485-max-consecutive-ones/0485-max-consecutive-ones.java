class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int runCnt = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                runCnt++;
                maxCnt = Math.max(maxCnt, runCnt);
            }
            else{
                runCnt = 0;
            }
        }
        return maxCnt;
    }
}