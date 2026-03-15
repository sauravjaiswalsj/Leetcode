class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];
        Arrays.fill(steps, -1);
        return climb(n, steps);
    }
    
    private int climb(int n, int[] steps){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (n == 2)
            return 2;
        
        if (steps[n-1] == -1){
            steps[n-1] = climb(n-1, steps);
        }

        if (steps[n-2] == -1)
            steps[n-2] = climb(n-2, steps);

        return steps[n-1] + steps[n-2];
    }
}