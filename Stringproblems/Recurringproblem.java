// Find Longest Recurring Subsequence in String

// Use Dynamic Porgramming for solving this problem

import java.util.*;

public class Recurringproblem {

    public static int longestRecurringSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        
        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[n][n];
    }

    public static void main(String[] args) {
        String s = "AABEBCDD";
        int result = longestRecurringSubsequence(s);
        System.out.println("Length of Longest Recurring Subsequence: " + result);
        
    }
}