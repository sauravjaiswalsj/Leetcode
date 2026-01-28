class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int low = 0, high = n - 1;
        char c = letters[0];

        while (low <= high){
            int mid = low + (high - low)/2;

            if (letters[mid] == target){
                low = mid + 1;
            }
            
            if (letters[mid] > target){
                c = letters[mid];
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return c;
    }
}