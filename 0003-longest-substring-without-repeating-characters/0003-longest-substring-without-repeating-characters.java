class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
         if (s == null || s.length() == 0)
            return 0;

        int i = 0;
        int j = 0;
        int maxLen = 0;

        while (j < s.length()){
            map.merge(s.charAt(j), 1, Integer::sum);

            while (map.size() < j - i + 1){
                map.merge(s.charAt(i), -1, Integer::sum);

                if (map.get(s.charAt(i)) == 0)
                    map.remove(s.charAt(i));
                ++i;
            }
            maxLen = Math.max(maxLen, j - i + 1);
            ++j;
        }
        return maxLen;
    }
}