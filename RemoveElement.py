class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        pointer = 0
        count = 0
        for id,item in enumerate(nums):
            if item == val:
                count += 1
            else:
                nums[pointer] = item
                pointer += 1
        for i in range(count):
            nums.pop()
        
