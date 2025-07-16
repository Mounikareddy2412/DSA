"""nums1=[]
nums1=[]
n=len(nums)
for i in range(0,n):
    for j in range(i+1,n):
        if nums[i]+nums[j]==target:
            nums1.append(i)
            nums1.append(j)
            print(nums1)"""
#class Solution:
#def twoSum(self, nums: list[int], target: int) -> list[int]:
nums = [3,4,5,6]
target = 7
num_map = {}  # value -> index
for i, num in enumerate(nums):
    complement = target - num
    print(num_map)
    if complement in num_map:
            print(num_map[complement], i)

    num_map[num] = i
