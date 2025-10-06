class Solution {
    public int singleNumber(int[] nums) {
        int xor1 = 0;
        for (int i : nums){
            xor1 ^= i;
        }
        return xor1;
    }
}