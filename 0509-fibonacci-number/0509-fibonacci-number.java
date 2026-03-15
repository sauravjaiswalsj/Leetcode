class Solution {
    public int fib(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        return fibo(n, arr);
    }
    
    private int fibo(int n, int[] arr){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        
        if(arr[n-1] == -1) {
            arr[n-1] = fibo(n-1, arr);
        }
        
        if (arr[n-2] == -1){
            arr[n-2] = fibo(n-2, arr);
        }
        return arr[n-1] + arr[n-2];
    }
}