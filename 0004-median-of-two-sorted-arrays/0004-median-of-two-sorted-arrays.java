class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merge log(m+n)
        int[] arr =  mergeArrays(nums1, nums2);
        // get median 
        int size = arr.length;
        System.out.println(arr.length);
        for (int i : arr){
            System.out.println(i);
        }
        if ((arr.length & 1) != 0){
            //odd
            return arr[size/2];
        }else{
            int val = arr[size/2] + arr[size/2 - 1];
            return val/2.0;
        }
    }
    int[] mergeArrays(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[ m + n];

        int i = 0, j = 0;
        int k = 0, t = m + n;
        while (i < m && j < n && k < t){
            if (nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }else {
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i < m && k < t){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n && k < t){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        return arr;
    }
}