class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String prefix = "";
        int first = 0, last = strs.length -1;
        int m = strs[first].length();
        int n = strs[last].length();
        int i = 0, j = 0;
        while (i < m && j < n){
            if (strs[first].charAt(i) == strs[last].charAt(j)){
                prefix += strs[first].charAt(i);
            }else{
                break;
            }
            i++;
            j++;
        }
        return prefix;
    }
}