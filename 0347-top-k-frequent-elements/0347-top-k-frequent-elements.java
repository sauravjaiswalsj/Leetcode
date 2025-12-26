class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int  i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        map = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
                (e1, e2) -> e1, LinkedHashMap::new));

        // for (Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     System.out.println(entry.getKey()+" "+ entry.getValue());
        // }

        int[] arr = new int[k];
        int j = 0;
        for (int i : map.keySet()){
            arr[j++] = i;
            if (j == k)
                break;
        }
        return arr;
    }
}