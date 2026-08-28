class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen=set()
        low=0
        maxcnt=0
        for high in range(len(s)):
            while s[high]  in seen:
                seen.remove(s[low])
                low+=1

            seen.add(s[high])

            maxcnt=max(maxcnt,high-low+1)
        return maxcnt


