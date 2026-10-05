class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs){
            int[] cnt = new int[26];
            for (char c : str.toCharArray()) 
                cnt[c - 'a']++;
            
            String ns = new String(Arrays.toString(cnt));
            map.computeIfAbsent(ns, x ->  new ArrayList<>()).add(str);
            //map.putIfAbsent(ns, new ArrayList<>()).add(str);
            //map.get(ns).add(str);
        }

        return new ArrayList<>(map.values());
    }
}