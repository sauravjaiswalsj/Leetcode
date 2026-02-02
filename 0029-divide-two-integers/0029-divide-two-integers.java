class Solution {
    public int divide(int dividend, int divisor) {
        if ((dividend == Integer.MIN_VALUE && divisor == -1) || (dividend == -1 && divisor== Integer.MIN_VALUE )){
            return Integer.MAX_VALUE;
        }

        return (int)Math.floor(dividend/divisor);
    }
}