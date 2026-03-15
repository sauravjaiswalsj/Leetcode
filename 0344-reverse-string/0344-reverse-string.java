class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
    
    private void reverse(char[] s, int l, int h){
        if (l >= h)
            return;
        
        char temp = s[l];
        s[l] = s[h];
        s[h] = temp;
        
        reverse(s, l+1, h-1);
    }
}