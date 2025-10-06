class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] visited = new int[nums2.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j] && visited[j] != 1){
                    list.add(nums1[i]);
                    visited[j] = 1;
                    break;
                }
            }
        }
        
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}