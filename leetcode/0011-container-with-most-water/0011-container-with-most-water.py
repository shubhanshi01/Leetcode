class Solution:
    def maxArea(self, nums: List[int]) -> int:
        
        n=len(nums)
        maxarea=0
        low=0
        high=n-1
        while(low<high):
            minheight=min(nums[low],nums[high])

            maxarea=max(maxarea,minheight*(high-low))

            if(nums[low]<nums[high]):
                low+=1
            else:
                high-=1
            


        return maxarea
            

        