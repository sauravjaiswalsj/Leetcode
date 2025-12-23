class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);

            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}