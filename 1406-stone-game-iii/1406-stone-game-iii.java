class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;

        // dp[i] = maximum score difference the current player
        // can obtain starting from index i
        int[] dp = new int[n + 1];

        // No stones remaining, so score difference is 0
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = 0;
            dp[i] = Integer.MIN_VALUE;

            // Take 1, 2, or 3 stones
            for (int take = 0; take < 3 && i + take < n; take++) {
                sum += stoneValue[i + take];

                dp[i] = Math.max(
                    dp[i],
                    sum - dp[i + take + 1]
                );
            }
        }

        if (dp[0] > 0) {
            return "Alice";
        } else if (dp[0] < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}