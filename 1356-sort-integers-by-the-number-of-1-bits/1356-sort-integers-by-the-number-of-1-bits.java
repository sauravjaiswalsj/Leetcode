class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++)
            nums[i] = arr[i];

        Arrays.sort(nums, (a, b) -> {
            int aCnt = Integer.bitCount(a);
            int bCnt = Integer.bitCount(b);

            int c = Integer.compare(aCnt, bCnt);
            if (c != 0)
                return c;
            
            return Integer.compare(a,b);
        });

        for (int i = 0; i < arr.length; i++){
            arr[i] = nums[i];
        }
        return arr;
    }
}
/*
return Arrays.stream(arr)
                     .boxed()
                     .sorted((a, b) -> {
                        return Integer.compare(Integer.bitCount(a), Integer.bitCount(b));
                     })
                     .mapToInt(Integer::intValue)
                     .toArray();

*/