class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void backtrack(
        int[] nums, 
        int remain, 
        int idx, 
        ArrayList<Integer> out, 
        List<List<Integer>> res
    ){
        if (remain == 0){
            res.add(new ArrayList<Integer>(out));
            return;
        }

        for (int i = idx; i < nums.length; i++){
            if (nums[i] > remain) continue;
            out.add(nums[i]);
            backtrack(nums, remain - nums[i], i, out, res);
            out.remove(out.size() -1);
        }
    }
}