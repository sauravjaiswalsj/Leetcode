class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int zeroCnt = 0;
        int k = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                temp[k++] = nums[i];
            }else
                ++zeroCnt;
        }

        for (int i = 0; i < zeroCnt; i++){
            temp[k++] = 0; 
        }

        for (int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }
}