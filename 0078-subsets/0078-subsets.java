class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();

        getAllSubset(nums, 0, new ArrayList<Integer>(),  subset);
        return subset;
    }

    private void getAllSubset(int[] nums, int i, List<Integer> out, List<List<Integer>> result){
        if (i == nums.length){
            result.add(new ArrayList<>(out));
            return;
        }
        out.add(nums[i]);
        getAllSubset(nums, i+1, out, result);
        out.remove(out.size() - 1);
        getAllSubset(nums, i+1, out, result);
    }
}