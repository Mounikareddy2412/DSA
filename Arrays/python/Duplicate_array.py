#Using Brute-force nested loop
"""def contain_duplicate(nums):
    n=len(nums)
    for i in range(0,n):
        for j in range(i+1,n):
            if nums[i]==nums[j]:
                return True
    return False

nums=[1,2,3,4]
print(contain_duplicate(nums))"""

#Better way (using a set)
def contain_duplicate(nums):
    seen=set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)
    return False
nums=[1,2,3,4]
print(contain_duplicate(nums))

            