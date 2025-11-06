public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";

        // Step 1: Transform string
        StringBuilder t = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }
        t.append("#$");

        int n = t.length();
        int[] P = new int[n];
        int center = 0, right = 0;

        // Step 2: Expand around centers using previous info
        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                P[i] = Math.min(right - i, P[mirror]);
            }

            // Attempt to expand palindrome centered at i
            while (t.charAt(i + (1 + P[i])) == t.charAt(i - (1 + P[i]))) {
                P[i]++;
            }

            // If palindrome expands past right boundary, adjust center
            if (i + P[i] > right) {
                center = i;
                right = i + P[i];
            }
        }

        // Step 3: Find the longest palindrome
        int maxLen = 0, centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }

        // Step 4: Extract result
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
