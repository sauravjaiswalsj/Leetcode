class Solution {
    public int countOdds(int low, int high) {
        // to count  # of odd we do (n + 1)/2;
        return (high + 1)/2 - low / 2;
    }
}