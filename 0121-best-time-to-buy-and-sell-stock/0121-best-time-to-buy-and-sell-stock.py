class Solution:
    def maxProfit(self, nums: List[int]) -> int:
        n=len(nums)
        maxprofit=0
        l,r=0,1
       
        
        while(r<n):
            if(nums[l]<nums[r]):
                maxprofit=max(maxprofit,nums[r]-nums[l])
            else:
                l=r
            r+=1

                

        return maxprofit

            
               
                

        