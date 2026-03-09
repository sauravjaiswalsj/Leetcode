class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        if (s == null || s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;
        while (j < s.length()){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0)+1);

            if (map.size() == j - i + 1){
                len = Math.max(j-i+1, len);
            }

            while (map.size() < j - i + 1){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)-1);

                if (map.getOrDefault(ch, 0) == 0)
                    map.remove(ch);
                 ++i;
            }
            ++j;
        } 
        return len;
    }
}