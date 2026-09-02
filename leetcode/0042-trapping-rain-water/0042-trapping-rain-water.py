class Solution:
    def trap(self, height: List[int]) -> int:
        low=0
        high=len(height)-1
        res=0
        maxL,maxR=height[low],height[high]

        while(low<high):
            if(maxL<maxR):
                low+=1
                maxL=max(height[low],maxL)
                res+=maxL-height[low]
            else:
                high-=1
                maxR=max(height[high],maxR)
                res+=maxR-height[high]




        return res
            


            
          