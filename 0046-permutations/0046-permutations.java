class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void backtrack(int[] nums,int idx, List<List<Integer>> res){
        if (idx == nums.length){
            ArrayList<Integer> list = new ArrayList<>();

            for (int i : nums){
                list.add(i);
            }
            res.add(list);
            return;
        }

        for (int i = idx; i < nums.length; i++){
            swap(nums, i, idx);
            backtrack(nums, idx+1, res);
            swap(nums, i, idx);
        }
    }
}