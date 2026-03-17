class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int xi = 0, yi = n;
        for (int i = 0; i < nums.length; i++){
            if ((i & 1) == 0)
                res[i] = nums[xi++];
            else
                res[i] = nums[yi++];
        }
        return res;
    }
}