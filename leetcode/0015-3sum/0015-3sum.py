class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        n=len(nums)
        res=[]
        nums.sort()
        low=0
        high=n-1

        for i, a in enumerate(nums):
            if a>0:
                break
            if(i>0 and a==nums[i-1]):
                continue
            low,high=i+1,len(nums)-1
            while(low<high):

                three=nums[low]+nums[high]+a
                
                if(three==0):
                    res.append([a,nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(nums[low-1]==nums[low] and low<high):
                        low+=1
                    
                elif(three<0):
                    low+=1
                else:
                    high-=1
            
        return res
                


        