class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic={}

        for i in range(len(nums)):
            if(nums[i] not in dic):
                dic[nums[i]]=1
            else:
                dic[nums[i]]+=1

        ans=[]
       

        sorted_by_value = dict(sorted(dic.items(), key=lambda item: item[1], reverse=True))

        for key in sorted_by_value.keys():
            if(len(ans)!=k):
                ans.append(key)
            else :
                break

        return ans

    