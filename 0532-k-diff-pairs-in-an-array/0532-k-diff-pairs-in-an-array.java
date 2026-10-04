class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] cnt = new int[1];
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0)+1);

        map.forEach((Key, Value) -> {
            if (k == 0 && map.get(Key)>=2){
                cnt[0]++;
            }
            else if (k != 0 && map.containsKey(Key + k))
                cnt[0]++;
            
        });
        
        return cnt[0];
    }
}