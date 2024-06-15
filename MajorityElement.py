import math
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        limit = math.ceil((len(nums)/2))
        choice = 0
        highest = 0
        check = []
        for item in nums:
            count = 0
            if item not in check:
                for jitem in nums:
                    if (item == jitem):
                        count += 1
                if (count > highest):
                    highest = count
                    choice = item
                check.append(item)
        return(choice)
