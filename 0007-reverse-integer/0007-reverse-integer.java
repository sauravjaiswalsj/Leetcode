class Solution {
    public int reverse(int x) {
        int count = (int)(Math.log10(Math.abs(x)) + 1);
        int temp = x;
        int val = 0;
        try{
            while (temp != 0){
                int rem = temp % 10;
                val += rem * Math.pow(10, count-1);
                count--;
                temp /= 10;
            }
            if (val == Integer.MAX_VALUE || val == Integer.MIN_VALUE )
                return 0;
            return val;
        }
        catch (Exception e){
            return 0;
        }
        
    }
}
    