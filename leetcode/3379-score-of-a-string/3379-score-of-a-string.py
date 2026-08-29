class Solution:
    def scoreOfString(self, s: str) -> int:
        sum=0
        ch=list(s)
        for i in range(len(ch)-1):
            diff=abs(ord(ch[i])-ord(ch[i+1]))
            sum+=diff

        return sum

        