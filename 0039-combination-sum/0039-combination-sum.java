class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(candidates, target, 0, 0, list, new ArrayList<Integer>());

        return list;
    }

    private void backtrack(int[] nums, int target, int idx, int sum, List<List<Integer>> res, ArrayList<Integer> out){

        if (idx == nums.length)
            return;

        if (sum > target){
                return;
        }

        if (sum == target){
            if (!res.contains(out))
                res.add(new ArrayList<Integer>(out));
            return;
        }

        for (int i = idx; i < nums.length; i++){
            System.out.println(sum);
            sum += nums[i];
            out.add(nums[i]);
            backtrack(nums, target, i, sum, res, out);
            out.remove(out.size()-1);
            sum -= nums[i];  
        }
    }
}