class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            if (x == 0) return x;
            long num = -n;
            double val = pow(x, num);
            return 1.0/val;
        }
        return pow(x, n);
    }

    private double pow(double x, long n){
        if (n == 0)
            return 1;
        if ((n & 1) == 0)
            return pow(x*x, n/2);
        else
            return x * pow(x*x, n/2);
    }
}