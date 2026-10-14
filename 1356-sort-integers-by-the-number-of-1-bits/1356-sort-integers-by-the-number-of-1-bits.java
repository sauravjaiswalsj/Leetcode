class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                     .boxed()
                     .sorted((a, b) -> {
                        int c = Integer.compare(Integer.bitCount(a), Integer.bitCount(b));
                        if (c != 0)
                            return c;
                        return Integer.compare(a, b);
                     })
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}