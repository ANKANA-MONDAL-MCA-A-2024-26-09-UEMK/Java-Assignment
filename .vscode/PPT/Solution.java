import java.util.HashSet;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkew";

        System.out.println("Input: " + input1 + " → Output: " + sol.lengthOfLongestSubstring(input1)); // 3
        System.out.println("Input: " + input2 + " → Output: " + sol.lengthOfLongestSubstring(input2)); // 1
        System.out.println("Input: " + input3 + " → Output: " + sol.lengthOfLongestSubstring(input3)); // 3
    }
}
