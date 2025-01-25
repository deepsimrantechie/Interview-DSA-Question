class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        // Recursive helper function
        return isPalindromeHelper(x, getDivisor(x));
    }

    // Helper function to calculate the divisor for the most significant digit
    private int getDivisor(int x) {
        int divisor = 1;
        while (x / divisor >= 10) {
            divisor *= 10;
        }
        return divisor;
    }

    // Recursive function to check palindrome
    private boolean isPalindromeHelper(int x, int divisor) {
        // Base case: If the number is reduced to a single digit or no digits, it's a palindrome
        if (x == 0) {
            return true;
        }

        // Check if the most significant and least significant digits are the same
        int firstDigit = x / divisor; // Most significant digit
        int lastDigit = x % 10;      // Least significant digit
        if (firstDigit != lastDigit) {
            return false;
        }

        // Remove the first and last digits
        x = (x % divisor) / 10;

        // Reduce the divisor by 100 (since two digits are removed)
        divisor /= 100;

        // Recursive call
        return isPalindromeHelper(x, divisor);
    }
}
