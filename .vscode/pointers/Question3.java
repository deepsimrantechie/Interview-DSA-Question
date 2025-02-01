class Solution {
    public boolean isSubsequence(String s, String t) {
        int left1 = 0; // Pointer for s
        int left2 = 0; // Pointer for t

        while (left1 < s.length() && left2 < t.length()) {
            if (s.charAt(left1) == t.charAt(left2)) { // Corrected typo here
                left1++;
            }
            left2++;
        }

        return left1 == s.length(); // Return true if all characters of s are matched
    }
}
