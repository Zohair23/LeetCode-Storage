class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        for i in nums:
            count = 0
            for id,item in enumerate(nums):
                if (i == item):
                    count += 1
                    if(count > 2):
                        nums.pop(id)
