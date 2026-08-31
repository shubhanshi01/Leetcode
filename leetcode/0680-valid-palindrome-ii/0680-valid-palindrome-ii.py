class Solution:
    def validPalindrome(self, s: str) -> bool:

        low=0
        high=len(s)-1
        dele=len(s)

        def check(low,high):
            while low<high:
                if s[low]!=s[high]:
                    return False
                low+=1
                high-=1

            return True

        
        while(low<=high):
            if(s[low].lower()==s[high].lower()):
                low+=1
                high-=1

            else:
                return check(low+1,high) or check(low,high-1)
        return True






        