class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        Map<Integer, Boolean> map = new TreeMap<>();

        for (int i : arr){
            map.putIfAbsent(i, true);
        }

        int maxLen = 0, currLen = 1;
        int lastElement = 0;
        int i = 0;
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()){
            if (i == 0){
                lastElement = entry.getKey();
                i++;
                continue;
            }
            int diff = Math.abs(entry.getKey() - lastElement);
            //System.out.println(diff);
            if (diff == 1 )
                ++currLen;
            
            lastElement = entry.getKey();

            if (diff > 1){
                maxLen = Math.max(currLen, maxLen);
                currLen = 1;
            }
        }

        return Math.max(maxLen, currLen);
    }
}

/*
[1, 2, 3, 4, 100, 200]

currLen = 1
maxLen = 0
*/