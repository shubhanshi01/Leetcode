class Solution:
    def longestPalindrome(self, s: str) -> str:
        start=0
        maxlen=1

        def expand(left,right):
            nonlocal start,maxlen

            while left>=0 and right<len(s)  and s[left]==s[right]:
                currLen=right-left+1

                if currLen>maxlen:
                    start=left
                    maxlen=currLen

                left-=1
                right+=1

        for i in range(len(s)):
            expand(i,i)

            expand(i,i+1)
        return s[start:start+maxlen]
            

