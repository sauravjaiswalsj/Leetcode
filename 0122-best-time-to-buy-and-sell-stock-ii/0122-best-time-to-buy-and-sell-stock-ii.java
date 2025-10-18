class Solution {
    public int maxProfit(int[] arr) {
        int min = -1, max = -1;
        int sum = 0;
        int n = arr.length;
        if (n < 2)
            return 0;
        for (int i = 0; i < arr.length; i++){
            if (i == 0 && (arr[i] <= arr[i+1])){
                min = arr[i];
            }
            else if (i < n-1 && (arr[i] <= arr[i+1] && arr[i] <= arr[i-1])){
                 min = arr[i];
            }
            
            if ((i == n-1 && (arr[i] >= max && arr[i] >= arr[i-1])) && min != -1){
            
                max = arr[i];
            }
            else if (((i != 0 && i <= n - 2) && (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) && min != -1)){
                max = arr[i];
            }
            
            //System.out.println(min + " : " + max);
            
            if (min != -1 && max != -1){
                
                sum += max - min;
                min = -1;
                max = -1;
            }
            
            
        }
        
        return sum;
    }
}