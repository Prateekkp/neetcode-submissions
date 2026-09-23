class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        n = len(nums)

        seen = {}

        for num in nums:
            seen[num] = seen.get(num, 0) + 1
            
        for key, value in seen.items():
            if value > n/2:
                return key
        