class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prod = 1
        zero_cnt = 0

        for num in nums:
            if num != 0:
                prod *= num
            else:
                zero_cnt += 1

            if zero_cnt > 1:
                return [0] * n

        res = [0] * n

        for i, num in enumerate(nums):
            if zero_cnt:
                res[i] = prod if num == 0 else 0
            else:
                res[i] = prod // num

        return res