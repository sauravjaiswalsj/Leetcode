class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        int i2 = 0, i3 = 0, i5 = 0;
        arr[0] = 1;
        for (int i = 1; i < n; i++){
            int v2 = arr[i2] * 2;
            int v3 = arr[i3] * 3;
            int v5 = arr[i5] * 5;

            int min = Math.min(v2, Math.min(v3, v5));
            arr[i] = min;
            if (min == v2) ++i2;
            if (min == v3) ++i3;
            if (min == v5) ++i5;
        }
        return arr[n-1];
    }
}