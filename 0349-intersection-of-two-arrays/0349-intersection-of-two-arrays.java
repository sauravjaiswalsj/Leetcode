class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++){            
                map.put(nums1[i],false);
        }
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                map.put(nums2[i],true);
            }
        }
        System.out.println(map);
        Set<Map.Entry<Integer, Boolean>> entrySet = map.entrySet();
        int cnt = 0;
        for(Map.Entry<Integer, Boolean> entry: entrySet){
            if(entry.getValue())
                cnt++;
        }
        int[] arr = new int[cnt];
        int i = 0;
        for(Map.Entry<Integer, Boolean> entry: entrySet){
            if(entry.getValue()){
                arr[i] = entry.getKey();
                i++;
            }
        }
        return arr;
    }
}