class Solution:
    def longestPalindrome(self, s: str) -> str:
       
        start=0
        maxlen=1
        n=len(s)
        if n==0:
            return ""

        dp=[[False]*n for _ in range(n)]

        for i in range(n):
            dp[i][i]=True

        for length in range(2,n+1):
            for left in range (n-length+1):
                right=left+length-1


                if(s[left]==s[right]):
                    if(right-left+1<=3):
                        dp[left][right]=True
                    else:
                        dp[left][right]=dp[left+1][right-1]
                
                if(dp[left][right]==1 and length>maxlen):
                    start=left
                    maxlen=length

        return s[start:start+maxlen]


                    





