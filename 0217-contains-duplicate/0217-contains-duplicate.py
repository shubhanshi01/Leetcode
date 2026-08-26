class Solution(object):
    def containsDuplicate(self, nums):
        n=sorted(nums)
        for i in range(len(n)-1):
            if(n[i]==n[i+1]):
                return True
        return False
        