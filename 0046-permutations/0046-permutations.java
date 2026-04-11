class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(nums, 0, list);
        return list;
    }

    private void backtrack(int[] nums, int idx, List<List<Integer>> res){
        if (idx == nums.length){
            List<Integer> temp = new ArrayList<Integer>();
            for (int i : nums){
                temp.add(i);
            }
            res.add(temp);
            return;
        }

        for (int i = idx; i < nums.length; i++){
            swap(nums, i, idx);
            backtrack(nums, idx+1, res);
            swap(nums, i, idx);
        }
    }

    private void swap(int[] nums, int i, int idx){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}