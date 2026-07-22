import java.util.*;

class Solution {

    private static final int MASKS = 1 << 10;
    private static final int MOD = 1_000_000_007;

    private int[] vals;
    private List<Integer>[] children;
    private long answer;

    public int goodSubtreeSum(int[] vals, int[] par) {
        this.vals = vals;

        int n = vals.length;

        children = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
        }

        for (int node = 1; node < n; node++) {
            children[par[node]].add(node);
        }

        answer = 0;
        dfs(0);

        return (int) (answer % MOD);
    }

    private long[] dfs(int node) {

        long[] dp = new long[MASKS];
        Arrays.fill(dp, -1);

        // Select nothing.
        dp[0] = 0;

        int nodeMask = getMask(vals[node]);

        // Select this node if its own digits are unique.
        if (nodeMask != -1) {
            dp[nodeMask] = vals[node];
        }

        for (int child : children[node]) {

            long[] childDp = dfs(child);
            long[] next = new long[MASKS];

            Arrays.fill(next, -1);

            for (int currentMask = 0;
                 currentMask < MASKS;
                 currentMask++) {

                if (dp[currentMask] == -1) {
                    continue;
                }

                for (int childMask = 0;
                     childMask < MASKS;
                     childMask++) {

                    if (childDp[childMask] == -1) {
                        continue;
                    }

                    // No digit may appear twice.
                    if ((currentMask & childMask) != 0) {
                        continue;
                    }

                    int combinedMask = currentMask | childMask;

                    next[combinedMask] = Math.max(
                        next[combinedMask],
                        dp[currentMask] + childDp[childMask]
                    );
                }
            }

            dp = next;
        }

        long maxScore = 0;

        for (long score : dp) {
            maxScore = Math.max(maxScore, score);
        }

        answer = (answer + maxScore) % MOD;

        return dp;
    }

    private int getMask(int value) {
        int mask = 0;

        while (value > 0) {
            int digit = value % 10;
            int bit = 1 << digit;

            // This digit already appeared in the same number.
            if ((mask & bit) != 0) {
                return -1;
            }

            mask |= bit;
            value /= 10;
        }

        return mask;
    }
}