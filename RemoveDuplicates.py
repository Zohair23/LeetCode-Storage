class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        pointer = 0
        unique = []
        count = 0
        for id,item in enumerate(nums):
            if item not in unique:
                nums[pointer] = item
                pointer += 1
                unique.append(item)
            else:
                count += 1
        
        for i in range(count):
            nums.pop()
