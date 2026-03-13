class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s == null || s.length() == 0 || t == null || t.length() == 0)
            return s;

        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int cnt = map.size();

        int i = 0, j = 0;

        String str = "";
        int len = Integer.MAX_VALUE;

        while (j < s.length()){
            char c = s.charAt(j);

            if (map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) -1);
                if (map.getOrDefault(c, 0) == 0)
                    cnt -= 1;
            }

            while (cnt == 0){
                if (j - i + 1 < len){
                    len = j - i + 1;
                    str = s.substring(i, j+1);
                }

                char rem = s.charAt(i);
                if (map.containsKey(rem)){
                    if (map.getOrDefault(rem , 0) == 0)
                        ++cnt;
                    map.put(rem, map.getOrDefault(rem, 0) + 1);
                    
                }
                ++i;
            }
            ++j;
        }

        return str;
    }
}