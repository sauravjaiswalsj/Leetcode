class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String word = "";

        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                word += s.charAt(i);
        }

        String test = "";
        for (int i = 0; i < word.length(); i++){
            test = word.charAt(i) + test;
        }

        System.out.println(test);
        return word.equals(test);
    }
}