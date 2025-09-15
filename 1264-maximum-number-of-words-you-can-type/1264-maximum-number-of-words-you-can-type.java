class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int cnt = arr.length;
        for (int i = 0; i < arr.length; i++){
            boolean canType = true;
            for (int j = 0; j < brokenLetters.length(); j++){
                if (arr[i].contains(String.valueOf(brokenLetters.charAt(j)))){
                    canType = false;
                    break;
                }
            }
            if (!canType)
                --cnt;
        }
        
        return cnt;
    }
}