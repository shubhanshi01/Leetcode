class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        d={}
        maxitem=-1
        maxkey=0

        for i in range(len(nums)):
            if(nums[i] in d):
                d[nums[i]]=d[nums[i]]+1
            else:
                d[nums[i]]=1
        
        for key,value in d.items():
            if(maxitem<value):
            
                maxitem=value
                maxkey=key
            


        return maxkey
        