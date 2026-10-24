/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> out = new ArrayList<>();

        if (root == null)
            return new ArrayList<>();

        dfs(root, targetSum, 0, new ArrayList<>(), out);

        return out;
    }

    private void dfs(
        TreeNode root, 
        int target, 
        int sum, 
        List<Integer> path,
        List<List<Integer>> res
        ){
        if (root == null)
            return;

        sum += root.val;
        path.add(root.val);
            
        if (root.left == null && root.right == null){
            if (sum == target)
                res.add(new ArrayList<Integer>(path));
        }
        else{
            dfs(root.left, target, sum, path, res);
            dfs(root.right, target, sum, path, res);
        }

        // backtrack:: remove this node
        path.remove(path.size() - 1);
    }
}