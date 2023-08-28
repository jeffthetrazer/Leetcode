class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        pos = 0
        for i in nums:
            if i == target:
                return nums.index(i)
            elif i < target:
                pos = nums.index(i)+1
        return pos