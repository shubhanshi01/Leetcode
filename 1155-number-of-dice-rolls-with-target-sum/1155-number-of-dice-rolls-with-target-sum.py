class Solution:
    def numRollsToTarget(self, n, k, target):
        MOD=10**9+7

        memo = {}

        def rec(dice, target):

            if dice == 0:
                return 1 if target == 0 else 0

            if (dice, target) in memo:
                return memo[(dice, target)]

            ans = 0

            for face in range(1, k + 1):
                if face <= target:
                    ans += rec(dice - 1, target - face)

            memo[(dice, target)] = ans

            return ans

        return rec(n, target)%MOD