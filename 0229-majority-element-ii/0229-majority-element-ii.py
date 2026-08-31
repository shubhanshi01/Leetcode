class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        n=len(nums)
        d={}

        for i in range(n):
            if(nums[i] not in d):
                d[nums[i]]=1
            else:
                d[nums[i]]+=1
        ans=[]
        for key,value in d.items():
            if(value>n//3):
                ans.append(key)
        return ans
        