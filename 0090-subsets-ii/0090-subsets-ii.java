class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> res = new HashSet<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        
        for (ArrayList<Integer> out : res){
            list.add(out);
        }
        return list;
    }

    private void backtrack(int[] nums, int idx, ArrayList<Integer> out, HashSet<ArrayList<Integer>> res){
        if (!res.contains(out))
            res.add(new ArrayList<>(out));

        for (int i = idx; i < nums.length; i++){
            out.add(nums[i]);
            backtrack(nums, i+1, out, res);
            out.remove(out.size()-1);
        }
    }
}