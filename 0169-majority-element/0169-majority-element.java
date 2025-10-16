class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums){
            if (map.containsKey(i)){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }else{
                map.put(i, 1);
            }
        }

        int max = Integer.MIN_VALUE, maxEle = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if (value > max){
                max = value;
                maxEle = entry.getKey();
            }
        }

        return maxEle;
    }
}