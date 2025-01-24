class Solution {
    public boolean isSubsequence(String s, String t) {
        int left1 = 0; // Pointer for s
        int left2 = 0; // Pointer for t

        // Traverse both strings
        while (left1 < s.length() && left2 < t.length()) {
            // If characters match, move pointer for s
            if (s.charAt(left1) == t.charAt(left2)) {
                left1++;
            }
            // Always move pointer for t
            left2++;
        }

        // If we have traversed all of s, it's a subsequence
        return left1 == s.length();
    }
}
