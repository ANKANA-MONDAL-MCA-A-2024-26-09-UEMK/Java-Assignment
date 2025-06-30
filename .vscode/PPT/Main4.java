public class Main4 {
    public static void main(String[] args) {
        RegexMatcher matcher = new RegexMatcher();

        System.out.println("Example 1 Output: " + matcher.isMatch("aa", "a"));     // false
        System.out.println("Example 2 Output: " + matcher.isMatch("aa", "a*"));    // true
        System.out.println("Example 3 Output: " + matcher.isMatch("ab", ".*"));    // true
    }
}

class RegexMatcher {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Initialize the pattern for empty string cases
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*')
                dp[0][j] = dp[0][j - 2];
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    char prev = p.charAt(j - 2);
                    dp[i][j] = dp[i][j - 2]; // Zero occurrences

                    if (prev == '.' || prev == sc) {
                        dp[i][j] |= dp[i - 1][j]; // One or more occurrences
                    }
                }
            }
        }

        return dp[m][n];
    }
}

