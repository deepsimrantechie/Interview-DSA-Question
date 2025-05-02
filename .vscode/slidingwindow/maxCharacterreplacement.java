class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxWindow = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;//this is the part of string basically 'B'-'A' =1Similary this works for every character 
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
            int windowLength = right - left + 1;
            while (windowLength - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;  
                left++;
                windowLength = right - left + 1;
            }
            maxWindow = Math.max(maxWindow, windowLength);
        }
        return maxWindow;
    }
}
{/**in this code we are creating
1. creating an fre array to store the fre of all the character apperaing 

2. using two pointer approch to solv it
using left and right pointer 

we are checking
character_nneed_to_change = windowSize - maxFreq;
then we are cheking windowlength and maxwindow to find the maxwindow
and also windowlenght - maxwindow shouwl not be exceeds from k given in the question

 */}
