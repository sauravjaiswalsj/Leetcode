class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, list, new ArrayList<Integer>());

        return list;
    }

    private void backtrack(int[] nums, int target, int idx, int sum, List<List<Integer>> res, ArrayList<Integer> out){
        if (sum > target){
                return;
        }

        if (sum == target){
            if (!res.contains(out))
                res.add(new ArrayList<Integer>(out));
            return;
        }

        for (int i = idx; i < nums.length; i++){
            //System.out.println(sum);
            if (i > idx && nums[i] == nums[i-1]) continue;
            sum += nums[i];
            out.add(nums[i]);
            backtrack(nums, target, i+1, sum, res, out);
            out.remove(out.size()-1);
            sum -= nums[i];  
        }
    }
}