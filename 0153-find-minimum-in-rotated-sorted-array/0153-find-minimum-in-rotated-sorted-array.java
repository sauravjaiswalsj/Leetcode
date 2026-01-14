class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        if(nums[left]<nums[right]){return nums[left];}
        if(nums.length==1){return nums[left];}
        while(left<right){
            int inflectionPoint=(left+right)/2;
            if(nums[inflectionPoint]>nums[inflectionPoint+1] && inflectionPoint<nums.length){
                return nums[inflectionPoint+1];
            }
            if(nums[inflectionPoint]<nums[inflectionPoint-1] && inflectionPoint>0){
                return nums[inflectionPoint];
            }
            if(nums[inflectionPoint]>nums[left]){
                left=inflectionPoint+1;
            }else{
                right=inflectionPoint-1;
            } 
        }
        return -1;
    }
}