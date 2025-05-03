//check the valid paranthesisi using the greedy algorithm
class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0;
        int leftMax = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                leftMin--;
                leftMax--;
            } else if (c == '*') {
                leftMin--;  // assume '*' is ')'
                leftMax++;  // assume '*' is '('
            }

            if (leftMax < 0) {
                return false;  // too many closing brackets
            }

            if (leftMin < 0) {
                leftMin = 0;  // clamp: can't have negative unmatched '('
            }
        }

        return leftMin == 0;
    }
}
