class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ptr1 = 0;
        int ptr2 = numbers.length - 1; // Start from the last index instead of 1

        while (ptr1 < ptr2) {
            int sum = numbers[ptr1] + numbers[ptr2];

            if (sum == target) {
                return new int[]{ptr1 + 1, ptr2 + 1}; // Return 1-based index
            } else if (sum < target) {
                ptr1++; // Move left pointer right to increase sum
            } else {
                ptr2--; // Move right pointer left to decrease sum
            }
        }

        return new int[]{}; // Return empty array if no solution is found
    }
}
