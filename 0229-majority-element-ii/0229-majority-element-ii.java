class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if (nums.length < 2){
            for (int i : nums)
                list.add(i);
            return list;
        }
        
        int candidate1 = -1;
        int candidate2 = -2;
        
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < nums.length; i++){
            if (candidate1 == nums[i])
                ++cnt1;
            else if (candidate2 == nums[i])
                ++cnt2;
            else if (cnt1 == 0){
                candidate1 = nums[i];
                cnt1 = 1;
            }
            else if (cnt2 == 0){
                candidate2 = nums[i];
                cnt2 = 1;
            }  
            else{
                --cnt1;
                --cnt2;
            }
        }

        int count1 = 0;
        int count2 = 0;

        for (int i : nums){
            if (i == candidate1)
                ++count1;
            else if (i == candidate2)
                ++count2;
        }

        if (count1 > nums.length/3)
            list.add(candidate1);

        if (count2 > nums.length/3)
            list.add(candidate2);
        
        return list;
    }
}