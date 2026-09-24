class Solution {
    public boolean canReach(int[] arr, int start) {
        return solve(arr, start);
    }

    private boolean solve(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] == Integer.MAX_VALUE) {
            return false;
        }
        if (arr[start] == 0) {
            return true;
        }
        int move = arr[start];
        arr[start] = Integer.MAX_VALUE;
        return solve(arr, start-move) || solve(arr, start + move);

    }
}