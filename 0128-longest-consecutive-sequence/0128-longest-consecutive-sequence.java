class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 1)
            return 1;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }


        int maxLen = 0;
        int runLen = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (map.containsKey(entry.getKey())){
                ++runLen;
                if (!map.containsKey(entry.getKey() -1)){
                    runLen = 0;
                }
                maxLen = Math.max(runLen+1, maxLen);
            }
        }

        return Math.max(runLen, maxLen);
    }
}