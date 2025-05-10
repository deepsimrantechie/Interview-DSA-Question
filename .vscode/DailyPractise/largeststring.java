//largest string in k swap


class Solution {
    String max;  // To keep track of the maximum number found

    // Function to find the largest number after k swaps
    public String findMaximumNum(String s, int k) {
        max = s;
        char[] chars = s.toCharArray();
        findMax(chars, k, 0);
        return max;
    }

    // Helper function using backtracking
    private void findMax(char[] chars, int k, int index) {
        if (k == 0 || index == chars.length) return;

        char maxDigit = chars[index];

        // Find the maximum digit from current index to end
        for (int i = index + 1; i < chars.length; i++) {
            if (chars[i] > maxDigit) {
                maxDigit = chars[i];
            }
        }

        // If a greater digit is found, we need to try swaps
        if (maxDigit != chars[index]) {
            for (int i = index + 1; i < chars.length; i++) {
                if (chars[i] == maxDigit) {
                    swap(chars, index, i);

                    String current = new String(chars);
                    if (current.compareTo(max) > 0) {
                        max = current;
                    }

                    findMax(chars, k - 1, index + 1);

                    // Backtrack
                    swap(chars, index, i);
                }
            }
        } else {
            // No need to swap, just move forward
            findMax(chars, k, index + 1);
        }
    }

    // Utility function to swap characters in a char array
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}