class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs){
            int[] hash = new int[26];

            for (char c : word.toCharArray()) hash[c - 'a']++;

            groups.computeIfAbsent(Arrays.toString(hash), x -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}