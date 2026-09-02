class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        count=defaultdict(int)
        res=[]

        for num in nums:
            count[num]+=1

        for i in range(n):
            count[nums[i]]-=1
            if(i>0 and nums[i]==nums[i-1]):
                continue
            for j in range(i+1,n):
                count[nums[j]]-=1
                if(j>i+1 and nums[j]==nums[j-1]):
                    continue
                for k in range(j+1,n):
                    count[nums[k]]-=1
                    if(k>j+1 and nums[k]==nums[k-1]):
                    
                        continue
                    fourth=target-(nums[i]+nums[j]+nums[k])
                    if(count[fourth]>0):
                        res.append([nums[i],nums[j],nums[k],fourth])
                for k in range(j+1,n):
                    count[nums[k]]+=1
            for j in range(i+1,n):
                count[nums[j]]+=1
        return res
            
            
                


        