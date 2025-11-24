class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\s+");

         int low = 0, high = arr.length-1;

         while (low <= high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            ++low;
            --high;
         }

         String word = "";

        for (String t : arr){
            word += t + " ";
        }
        return word.trim();
    }
}