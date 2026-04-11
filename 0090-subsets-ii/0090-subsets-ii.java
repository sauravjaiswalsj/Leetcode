class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(nums, 0, new ArrayList<>(), res);

        return res;
    }

    private void backtrack(int[] nums, int idx, ArrayList<Integer> out, List<List<Integer>> res){
        res.add(new ArrayList<Integer>(out));


        for (int i = idx; i < nums.length; i++){
            if (i != idx && nums[i] == nums[i-1]) continue;

            out.add(nums[i]);
            backtrack(nums, i+1, out, res);
            out.remove(out.size() -1);
        }
    }
}