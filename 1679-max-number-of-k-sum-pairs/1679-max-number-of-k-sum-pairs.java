class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        //   nums[i], Freq
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int dif = k - nums[i];

            if (map.containsKey(dif)){
                int cnt = map.getOrDefault(dif,0);
                if (cnt <= 1)
                    map.remove(dif);
                else if (cnt > 1)
                    map.put(dif, cnt-1);
                ++count;
            }else{
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        return count;
    }
}