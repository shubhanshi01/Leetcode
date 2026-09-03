class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if(len(s1)>len(s2)):
            return False

        d1={}
        d2={}
        left=0

        for i in s1:
            d1[i]=1+d1.get(i,0)

        for right in range(len(s2)):
            d2[s2[right]]=1+d2.get(s2[right],0)
            if((right-left+1)>len(s1)):

                d2[s2[left]]-=1

                if(d2[s2[left]]==0):
                    del d2[s2[left]]
                    
                left+=1

            if d1==d2:
                return True
        return False



            