class Solution {
    public int fib(int n) {
        int[] arr = new int[n+1];
        return fibonacci(n, arr);
    }

    public int fibonacci(int n, int[] arr){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (arr[n-1] != 0)
            return arr[n];
        arr[n] = fibonacci(n-1, arr) + fibonacci(n-2, arr);
        return arr[n];
    }
}