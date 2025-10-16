class Solution {
    public int findSmallestInteger(int[] nums, int value) {
         int[] remainderCount = new int[value]; // Instead of HashMap

    // Count remainder frequencies
    for (int num : nums) {
        int r = ((num % value) + value) % value;
        remainderCount[r]++;
    }

    // Find the smallest i that can't be matched
    for (int i = 0; i < nums.length; i++) {
        int r = i % value;
        if (remainderCount[r] == 0)
            return i;
        remainderCount[r]--;
    }

    return nums.length;
    }
}