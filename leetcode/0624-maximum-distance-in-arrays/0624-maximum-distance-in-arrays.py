class Solution:
    def maxDistance(self, arrays: List[List[int]]) -> int:
        maxel=arrays[0][-1]
        minel=arrays[0][0]
        ans=0

        for i in range(1, len(arrays)):
            ans = max(ans, abs(arrays[i][0] - maxel))
            ans = max(ans, abs(arrays[i][-1] - minel))

            maxel=max(maxel,arrays[i][-1])
            minel=min(minel,arrays[i][0])

        return ans
        
        