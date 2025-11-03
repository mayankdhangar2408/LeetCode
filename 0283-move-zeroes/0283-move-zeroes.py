class Solution(object):
    def moveZeroes(self, nums):
        for item in nums:
            if item == 0:
                nums.remove(0)
                nums.append(0)