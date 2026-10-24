class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> out = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : p.toCharArray())
            map.merge(c, 1, Integer::sum);

        int i = 0;
        int size = p.length();
        for (int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            if (map.containsKey(c)){
                map.merge(c, -1, Integer::sum);
            }

            while (j - i + 1 > size){
                if (map.containsKey(s.charAt(i)))
                    map.merge(s.charAt(i), 1, Integer::sum);
                ++i;
                
            }

            if (j - i + 1 == size){
                if (map.values().stream().allMatch(x -> x == 0))
                    out.add(i);
            }
        }
        return out;
    }
}