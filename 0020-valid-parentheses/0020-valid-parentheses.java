class Solution {
    public boolean isValid(String s) {
        if ((s.length() & 1) == 1)
            return false;
        Stack<Character> brackets = new Stack<>();

        for (char c : s.toCharArray()){
            
            if (brackets.isEmpty() || opening(c)){
                brackets.push(c);
            }
            else if (!opening(c)){
                
                if (pairOfC(c) == brackets.peek())
                    brackets.pop();
                else 
                    return false;
            }
        }
        //System.out.println(brackets);
        return brackets.isEmpty();
    }  

    private boolean opening(char c){
        if (c == '(' || c == '{' || c == '[')
            return true;
        return false;
    }
    private char pairOfC(char c){
        if (c == ')')
            return '(';
        if (c == '}')
            return '{';
        if (c == ']')
            return'[';
        return c;
    }
}