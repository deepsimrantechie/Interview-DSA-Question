//Substrings with same first and last character

/**Input: s = "abcab"
Output: 7
Explanation: There are 7 substrings where the first and
 last characters are the same: "a", "abca", "b", "bcab", "c", "a", and "b" */

 //my approch but no optimal but working fine 
 class Solution {
    public int countSubstring(String s) {
        StringBuilder word = new StringBuilder();
       // StringBuilder str = new StringBuilder();
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i <= j && j < s.length() && i < s.length()) {
            //str.append(s.charAt(i));
            ans.add(1);

            while (i <= j && j < s.length() && i < s.length()) {
                if (s.charAt(i) != s.charAt(j)) {
                    word.append(s.charAt(j));
                    j++;
                } else if (s.charAt(i) == s.charAt(j) && i != j) {
                    word.append(s.charAt(j));
                    ans.add(word.length());
                    word.setLength(0);
                    j++;
                } else {
                    word.append(s.charAt(j));
                    j++; // Also handle i == j properly
                }
               
            }
            i++;
            j = i;
             word.setLength(0);
        }
        return ans.size();
    }
}

//optimal approch

class Solution {
    public int countSubstring(String s) {
        int[] freq = new int[26];
        for(char ch:s.tocharArray()){
            freq[ch-'a']++;
        }
        int count =0;
        for(int f:freq){
            count+=(f*(f+1))/2;

        }
        return count;
        
    }
}