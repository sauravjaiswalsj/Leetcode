class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int max = 0;
        for (int j = 0; j < fruits.length; j++){
            map.merge(fruits[j], 1, Integer::sum);

            while (map.size() > 2){
                map.merge(fruits[i], -1, Integer::sum);
                if (map.get(fruits[i]) <= 0)
                    map.remove(fruits[i]);
                ++i;
            }

            if (map.size() <= 2)
                max = Math.max(max, j - i + 1);
        }
        return max;
    }
}