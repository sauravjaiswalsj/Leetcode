class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        backtrack(nums, 0, new ArrayList<>(), list);
        
        return list;
    }

    private void backtrack(int[] nums, int idx, ArrayList<Integer> out, List<List<Integer>> res){
        if (!res.contains(out))
            res.add(new ArrayList<>(out));

        for (int i = idx; i < nums.length; i++){
            out.add(nums[i]);
            backtrack(nums, i+1, out, res);
            out.remove(out.size()-1);
        }
    }
}