class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        permute(nums, 0, list);
        return list;
    }

    private void permute(int[] arr, int st, List<List<Integer>> list){
        if (st == arr.length){
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            list.add(temp);
            return;
        }

        for (int i = st; i < arr.length; i++){
            swap(arr, st, i);
            permute(arr, st+1, list);
            swap(arr, st, i);
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}